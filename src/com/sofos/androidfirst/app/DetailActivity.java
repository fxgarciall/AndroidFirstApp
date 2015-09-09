package com.sofos.androidfirst.app;

import com.sybase.collections.GenericList;
import com.sybase.persistence.SynchronizationGroup;

import com.sofos.test.android.Customer;
import com.sofos.test.android.AndroidMobileAppTestDB;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class DetailActivity extends Activity
{
    private int surrogateKey;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail);
        
        Intent intent = this.getIntent();
        surrogateKey = Integer.valueOf(intent.getExtras().getString("sk"));
        Customer customer = Customer.find(surrogateKey);
        
        final EditText fname = (EditText)findViewById(R.id.fname);
        fname.setText(customer.getFNAME());
        final EditText lname = (EditText)findViewById(R.id.lname);
        lname.setText(customer.getLNAME());
        final EditText address = (EditText)findViewById(R.id.address);
        address.setText(customer.getADDRESS());
        final EditText phone = (EditText)findViewById(R.id.phone);
        phone.setText(customer.getPHONE());
        
        //Button submit = (Button)findViewById(R.id.submit);
        //submit.setOnClickListener(new OnClickListener(){

           // @Override
           // public void onClick(View v)
          //  {
            //    Customer customer = Customer.find(DetailActivity.this.surrogateKey);
            //    customer.setFNAME(fname.getText().toString());
            //    customer.setFNAME(lname.getText().toString());
            //    customer.setADDRESS(address.getText().toString());
            //    customer.setPHONE(phone.getText().toString());
            //    customer.update();
            //    customer.submitPending();
            //    GenericList<SynchronizationGroup> syncGroups = new GenericList<SynchronizationGroup>();
            //    syncGroups.add(AndroidMobileAppTestDB.getSynchronizationGroup("default"));
            //    AndroidMobileAppTestDB.beginSynchronize(syncGroups, "");
            //    DetailActivity.this.setResult(Activity.RESULT_OK);
            //    DetailActivity.this.finish();
          //  }});
            
    }
}
