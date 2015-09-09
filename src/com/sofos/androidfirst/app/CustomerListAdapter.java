package com.sofos.androidfirst.app;

import java.util.ArrayList;
import java.util.HashMap;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.sybase.collections.GenericList;
import com.sybase.persistence.AttributeTest;
import com.sybase.persistence.ChangeLog;
import com.sybase.persistence.Query;
import com.sybase.persistence.QueryResultSet;
import com.sybase.persistence.SortOrder;
import com.sybase.persistence.TestCriteria;
import com.sofos.test.android.AndroidMobileAppTestDB;


public class CustomerListAdapter extends BaseAdapter {
    
    private static final String NAME = "name";
    private ArrayList<HashMap<String, Object>> loadedCustomer;
    private LayoutInflater layoutInflater;
    private Context context;
    private static final int TAKE = 30;
    private int totalSize;
    private int lowIndex = 0; //0
    private int highIndex = 0; //40 = 39+1
    
    private int getCustomerCount()
    {
        Query query = new Query();
        query.select("count(*)");
        query.from("Customer", "x");
        
        QueryResultSet rs = AndroidMobileAppTestDB.executeQuery(query);
        rs.next();
        return rs.getInt(1);
    }
    
    private boolean hasLoadedCustomerChangedByServer()
    {
        boolean changed = false;
        Query query  = new Query();
        GenericList<ChangeLog> changeLogs = AndroidMobileAppTestDB.getChangeLogs(query);
        for(ChangeLog changeLog : changeLogs)
        {
            for(HashMap<String, Object> customerMap : loadedCustomer)
            {
                if(customerMap.containsValue(changeLog.getSurrogateKey()))
                {
                    changed = true;
                    break;
                }
            }
        }
        AndroidMobileAppTestDB.deleteChangeLogs();
        return changed;
    }
    
    private void reload(int skip, int take)
    {
        totalSize = getCustomerCount();
        loadedCustomer = loadCustomers(skip, take);
    }
    
    private ArrayList<HashMap<String, Object>> loadCustomers(int skip, int take)
    {
        ArrayList<HashMap<String, Object>> arrayList = new ArrayList<HashMap<String,Object>>();  
        
		AttributeTest at = new AttributeTest();
		
        Query query = new Query();
        query.select("x.FNAME, x.LNAME, x.surrogateKey, x.ID");
        query.from("Customer", "x");
        query.orderBy("ID", SortOrder.ASCENDING);
        
        //at.setAttribute("IV_USERID");
        //at.setTestValue("22");
        //at.setOperator(AttributeTest.EQUAL);
        
        query.setTestCriteria(at);
        
        query.setTake(take);
        query.setSkip(skip);
        
        lowIndex = skip;
        highIndex = lowIndex;
        
        QueryResultSet rs = AndroidMobileAppTestDB.executeQuery(query);
        while(rs.next())
        {
            String fname = rs.getString(1);
            String lname = rs.getString(2);
            long sk = rs.getLong(3);
            String id = rs.getString(4);
            
            HashMap<String, Object> tempHashMap = new HashMap<String, Object>();
            tempHashMap.put(NAME, id + " " + fname + " " + lname);  
            tempHashMap.put("sk", sk);
            arrayList.add(tempHashMap);
            
            highIndex++;
        }
        
        return arrayList;  
    }
    
    
    public CustomerListAdapter(Context context) {
        
        this.context = context;
        this.layoutInflater = LayoutInflater.from(context);
        reload(0, TAKE);
    }

    public int getCount() {
        return totalSize;
    }


    public Object getItem(int position) {
        reloadIfNeeded(position);
        return loadedCustomer.get(position - lowIndex);
    }
    
    @SuppressWarnings("unchecked")
    public String getSK(int position)
    {
        HashMap<String, Object> map = (HashMap<String, Object>)getItem(position);
        return map.get("sk").toString();
    }


    private void reloadIfNeeded(int newPosition)
    {
        if(newPosition < lowIndex || newPosition >= highIndex)
        {
            int lowIndex = (newPosition/TAKE)*TAKE;
            reload(lowIndex, TAKE);
        }
    }

    public void refreshUI(boolean force)
    {
        boolean refresh = false;
        if( !force )
        {
            refresh = hasLoadedCustomerChangedByServer();
        }
        else
        {
            refresh = true;
        }
        if(refresh)
        {
            reload(lowIndex, TAKE);
            ((Activity)context).runOnUiThread(
                    new Runnable()
                    {
                        @Override
                        public void run()
                        {
                            CustomerListAdapter.this.notifyDataSetChanged();    
                        }                        
                    }
               );
        }
    }

    public long getItemId(int position) {
        return position;
    }


    public View getView(int position, View convertView, ViewGroup parent) {

        TextView tv = null;
        if(convertView==null){
            convertView = layoutInflater.inflate(R.layout.customer, null);
        }
        tv = (TextView)convertView.findViewById(R.id.textView1);        
        reloadIfNeeded(position);        
        tv.setText(loadedCustomer.get(position - lowIndex).get(NAME).toString());

        return convertView;
    }
}