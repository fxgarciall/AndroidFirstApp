package com.sofos.androidfirst.app;

import java.util.Hashtable;
import com.sybase.collections.StringList;
import com.sybase.collections.StringProperties;
import com.sybase.mobile.ApplicationCallback;
import com.sybase.mobile.ConnectionStatus;
import com.sybase.collections.GenericList;
import com.sybase.mobile.Application;
import com.sybase.mobile.ConnectionProperties;
import com.sybase.mobile.RegistrationStatus;
import com.sybase.persistence.DefaultCallbackHandler;
import com.sybase.persistence.LoginCredentials;
import com.sybase.persistence.SynchronizationAction;
import com.sybase.persistence.SynchronizationContext;
import com.sybase.persistence.SynchronizationGroup;
import com.sybase.persistence.SynchronizationStatus;

import com.sofos.test.android.AndroidMobileAppTestDB;
import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import android.view.*;
import android.widget.*;
import android.widget.AdapterView.OnItemClickListener;

public class TestSampleActivity extends Activity
{
    private static final int REQUEST_DETAIL = 99;
    private static String USERNAME = "supAdmin";
    private static String PASSWORD = "Beta_1234";
    private static String HOST = "10.110.6.8";
    private static int PORT = 5001;
    private static int TIMEOUT = 600;
    private CustomerListAdapter adapter;

    private static volatile boolean initializationDone = false;
	//Comentario para GitHub
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        initializeApplication();
    }

    protected void onActivityResult(int requestCode, int resultCode, Intent data)
    {
        if (requestCode == REQUEST_DETAIL)
        {
            if (resultCode == RESULT_OK)
            {
                TestSampleActivity.this.adapter.refreshUI(true);
            }
        }
    }

    private void initializeApplication()
    {       
        final ProgressDialog dialog = new ProgressDialog(this);

        dialog.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
        dialog.setTitle("on boarding ...");
        dialog.setMessage("Please wait while download initial data...");
        dialog.setIndeterminate(false);
        dialog.setProgress(100);
        dialog.setCancelable(true);
        dialog.show();

        new Thread()
        {
            @Override
            public void run()
            {
                try
                {
                    int count = 0;
                    while (!initializationDone)
                    {
                        dialog.setProgress(++count);
                        Thread.sleep(500);

                        if (count == 100)
                        {
                            count = 0;
                        }
                    }
                    dialog.cancel();
                }
                catch (Exception e)
                {
                    dialog.cancel();
                }
            }
        }.start();

        Application app = Application.getInstance();
        app.setApplicationIdentifier("AndroidMobileAppTest");
        app.setApplicationContext(TestSampleActivity.this);

        new Thread(new Runnable()
        {
            @Override
            public void run()
            {
                try
                {
                    Application app = Application.getInstance();
                    ApplicationCallback appCallback = new MyApplicationCallback();
                    app.setApplicationCallback(appCallback);
                    
                    AndroidMobileAppTestDB.registerCallbackHandler(new CustomerDBCallback());
                    AndroidMobileAppTestDB.setApplication(app);
                    AndroidMobileAppTestDB.getSynchronizationProfile().setServerName(HOST); // Convenience only

                    ConnectionProperties connProps = app.getConnectionProperties();
                    LoginCredentials loginCredentials = new LoginCredentials(USERNAME, PASSWORD);

                    connProps.setLoginCredentials(loginCredentials);
                    connProps.setServerName(HOST);
                    connProps.setPortNumber(PORT);
                    
                    Log.i("AndroidMobileAppTest","Starting Application Registration");
                    if (app.getRegistrationStatus() != RegistrationStatus.REGISTERED)
                    {
                    	try {
                    		app.registerApplication(TIMEOUT);	
                    	}
                    	catch (Exception e) 
                    	{
                    		Log.e("AndroidMobileAppTest","Cannot register " + e.getMessage());
                    	}
                        
                    }
                    else
                    {
                        app.startConnection(TIMEOUT);
                    }
                    Log.i("AndroidMobileAppTest","Application REGISTERED");

                    if (!AndroidMobileAppTestDB.isSynchronized("default"))
                    {
                    	Log.i("AndroidMobileAppTest","Starting Initial Sync");
                    	AndroidMobileAppTestDB.disableChangeLog();
                    	AndroidMobileAppTestDB.synchronize(); // Initial Synchronize

                        SynchronizationGroup sg = AndroidMobileAppTestDB.getSynchronizationGroup("default");
                        sg.setEnableSIS(true);
                        sg.save();
                        AndroidMobileAppTestDB.synchronize();
                        Log.i("AndroidMobileAppTest","Initial Sync COMPLETED");
                    }
                    AndroidMobileAppTestDB.enableChangeLog();
                }
                catch (Exception e)
                {
                    e.printStackTrace();
                }
                finally
                {
                    initializationDone = true;
                }

                TestSampleActivity.this.runOnUiThread(new Runnable()
                {
                    @Override
                    public void run()
                    {
                        adapter = new CustomerListAdapter(TestSampleActivity.this);

                        ListView listView = (ListView) findViewById(R.id.listView1);
                        listView.setAdapter(adapter);

                        listView.setOnItemClickListener(new OnItemClickListener()
                        {
                            @Override
                            public void onItemClick(AdapterView<?> a, View v, int position, long id)
                            {
                                Intent intent = new Intent(TestSampleActivity.this, DetailActivity.class);
                                intent.putExtra("sk", adapter.getSK(position));
                                TestSampleActivity.this.startActivityForResult(intent, REQUEST_DETAIL);
                            }

                        });
                    }

                });
            }
        }).start();

    }

    class MyApplicationCallback implements ApplicationCallback
    {
    	public void onApplicationSettingsChanged(StringList nameList)
    	{
    		 Log.i("AndroidMobileAppTest","Application Settings Changed: "+ nameList);
    	}
    	public void onConnectionStatusChanged(int connectionStatus, int errorCode, String errorMessage)
    	{
            switch (connectionStatus)
            {
                case ConnectionStatus.CONNECTED:
                	System.out.println("Device is Connected");
                    break;
                case ConnectionStatus.CONNECTING:
                	System.out.println("Device is Connecting");
                    break;
                case ConnectionStatus.CONNECTION_ERROR:
                	System.out.println("Connection Error: " + errorMessage);
                    break;
                case ConnectionStatus.DISCONNECTED:
                	System.out.println("Device is Disconnected");
                    break;
                case ConnectionStatus.DISCONNECTING:
                	System.out.println("Device is Disconnecting");
                    break;
            }    		
    	}
    	public void onRegistrationStatusChanged(int registrationStatus, int errorCode, String errorMessage)
    	{
            switch (registrationStatus)
            {
                case RegistrationStatus.REGISTERED:
                	System.out.println("Device is REGISTERED");
                    break;
                case RegistrationStatus.REGISTERING:
                	System.out.println("Device is REGISTERING");
                    break;
                case RegistrationStatus.REGISTRATION_ERROR:
                	System.out.println("Registration Error: " + errorMessage);
                    break;
                case RegistrationStatus.UNREGISTERED:
                	System.out.println("Device is UNREGISTERED");
                    break;
                case RegistrationStatus.UNREGISTERING:
                	System.out.println("Device is UNREGISTERING");
                    break;
            }    		
    	}
    	public void onHttpCommunicationError(int errorCode, String errorMessage, StringProperties httpHeaders)
    	{
    		System.out.println("ERROR - HTTP Communication Error: "+ errorMessage);
    	}
    	public void onDeviceConditionChanged(int condition)
    	{
    		System.out.println("Device Condition Status: "+ condition);
    	}
		@Override
		public void onCustomizationBundleDownloadComplete(String arg0,
				int arg1, String arg2) {
			// TODO Auto-generated method stub
			
		}
		@Override
		public int onPushNotification(Hashtable arg0) {
			// TODO Auto-generated method stub
			return 0;
		}
    }
    
    private class CustomerDBCallback extends DefaultCallbackHandler
    {
        @Override
        public int onSynchronize(GenericList<SynchronizationGroup> groups, SynchronizationContext context)
        {
        	Log.i("AndroidMobileAppTest","OnSynchronize() called with STATUS " + context.getStatus());
            if (context.getStatus() == SynchronizationStatus.ERROR)
            {
            	Log.e("AndroidMobileAppTest","ERROR " +
                   "[Exception message = " + context.getException().getMessage() +
                   "\n" + context.getException().getStackTrace());
            }        	
        	
            if (context.getStatus() == SynchronizationStatus.STARTING)
            {
                TestSampleActivity.this.runOnUiThread(new Runnable()
                {

                    @Override
                    public void run()
                    {
                        Toast.makeText(TestSampleActivity.this, "Synchronizing ... ", Toast.LENGTH_SHORT);
                    }
                });
            }
            else if (context.getStatus() == SynchronizationStatus.FINISHING || context.getStatus() == SynchronizationStatus.ASYNC_REPLAY_UPLOADED)
            {
                TestSampleActivity.this.runOnUiThread(new Runnable()
                {
                    @Override
                    public void run()
                    {
                        Toast.makeText(TestSampleActivity.this, "Synchronize done", Toast.LENGTH_SHORT);
                    }
                });
                if (TestSampleActivity.this.adapter != null)
                {
                    TestSampleActivity.this.adapter.refreshUI(false);
                }
            }

            return SynchronizationAction.CONTINUE;
        }
    }
}