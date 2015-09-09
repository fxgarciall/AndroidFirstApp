/**
 * Generated by Sybase AFX Compiler with templateJ
 * Compiler version - 2.3.2.380
 * mbs - false 
 */
package com.sofos.test.android;

@SuppressWarnings("all")
public  class LogRecordImpl extends com.sybase.persistence.AbstractEntity implements com.sybase.persistence.LogRecord, com.sybase.persistence.MobileBusinessObject, com.sybase.reflection.ClassWithMetaData
{
    /** Begin code region: MetaData **/
    private static com.sofos.test.android.intrnl.LogRecordImplMetaData META_DATA = new com.sofos.test.android.intrnl.LogRecordImplMetaData();
    
    /**
     * return MetaData object  
     */
    public com.sybase.reflection.ClassMetaData getClassMetaData()
    {
        return META_DATA;
    }
    
    /**
     * return MetaData object  
     */
    public static com.sybase.reflection.EntityMetaData getMetaData()
    {
        return META_DATA;
    }
    
    /** End code region: MetaData **/
    protected static com.sybase.sup.client.persistence.EntityDelegate DELEGATE = 
        com.sybase.sup.client.persistence.DelegateFactory.createEntityDelegate("LogRecordImpl", com.sofos.test.android.LogRecordImpl.class, "AndroidMobileAppTest.LogRecordImpl", META_DATA, com.sofos.test.android.AndroidMobileAppTestDB.getDelegate());
    
    
    /** Begin code region: Properties **/
    private int __level ;  
    
    private int __code ;  
    
    private java.lang.String __eisCode ;  
    
    private java.lang.String __message ;  
    
    private java.lang.String __component ;  
    
    private java.lang.String __entityKey ;  
    
    private java.lang.String __operation ;  
    
    private java.lang.String __requestId ;  
    
    private java.sql.Timestamp __timestamp ;  
    
      
    
      
    
      
    
      
    
    private long __messageId ;  
    
      
    
      
    
    public long getAttributeLong(int id)
    {
        switch(id)
        {
        case 98:
            return getMessageId();
        default:
            return super.getAttributeLong(id);
        }
    }
    
    public void setAttributeLong(int id, long v)
    {
        switch(id)
        {
        case 98:
            setMessageId((long)v);
            break;
        default:
            super.setAttributeLong(id, v);
            break;
        }
    }
    public java.lang.String getAttributeNullableString(int id)
    {
        switch(id)
        {
        case 101:
            return getEisCode();
        case 102:
            return getMessage();
        case 103:
            return getComponent();
        case 104:
            return getEntityKey();
        case 105:
            return getOperation();
        case 106:
            return getRequestId();
        default:
            return super.getAttributeNullableString(id);
        }
    }
    
    public void setAttributeNullableString(int id, java.lang.String v)
    {
        switch(id)
        {
        case 101:
            setEisCode((java.lang.String)v);
            break;
        case 102:
            setMessage((java.lang.String)v);
            break;
        case 103:
            setComponent((java.lang.String)v);
            break;
        case 104:
            setEntityKey((java.lang.String)v);
            break;
        case 105:
            setOperation((java.lang.String)v);
            break;
        case 106:
            setRequestId((java.lang.String)v);
            break;
        default:
            super.setAttributeNullableString(id, v);
            break;
        }
    }
    public java.sql.Timestamp getAttributeNullableDateTime(int id)
    {
        switch(id)
        {
        case 107:
            return getTimestamp();
        default:
            return super.getAttributeNullableDateTime(id);
        }
    }
    
    public void setAttributeNullableDateTime(int id, java.sql.Timestamp v)
    {
        switch(id)
        {
        case 107:
            setTimestamp((java.sql.Timestamp)v);
            break;
        default:
            super.setAttributeNullableDateTime(id, v);
            break;
        }
    }
    public int getAttributeInt(int id)
    {
        switch(id)
        {
        case 99:
            return getLevel();
        case 100:
            return getCode();
        default:
            return super.getAttributeInt(id);
        }
    }
    
    public void setAttributeInt(int id, int v)
    {
        switch(id)
        {
        case 99:
            setLevel((int)v);
            break;
        case 100:
            setCode((int)v);
            break;
        default:
            super.setAttributeInt(id, v);
            break;
        }
    }
    
    public Object getAttributeJson(int id)
    {
        switch(id)
        {
        default:
            return super.getAttributeJson(id);
        }
    }
    
    public void setAttributeJson(int id, Object value)
    {
        switch(id)
        {
        default:
            super.setAttributeJson(id, value);
            break;
        }
    }
    /** End code region: Properties **/
    
    /** Begin code region: Constructor and init **/
    /**
     * Creates an instance of com.sofos.test.android.LogRecordImpl  
     */
    public LogRecordImpl()
    {
        setEntityDelegate(DELEGATE);
        _init();
    }
    protected void _init()
    {
        
    }
    /** End code region: Constructor and init **/
    
    /**
     * Get the value of level  
     */
    public int getLevel()
    {
        
        return __level;
    }
    /**
     * Set the value of level  
     */
    public void setLevel(int value)
    {
        if(__level != value)
        {
            _isDirty = true;
        }
        __level = value;
    }       
    /**
     * Get the value of code  
     */
    public int getCode()
    {
        
        return __code;
    }
    /**
     * Set the value of code  
     */
    public void setCode(int value)
    {
        if(__code != value)
        {
            _isDirty = true;
        }
        __code = value;
    }       
    /**
     * Get the value of eisCode  
     */
    public java.lang.String getEisCode()
    {
        
        return __eisCode;
    }
    /**
     * Set the value of eisCode  
     */
    public void setEisCode(java.lang.String value)
    {
        if ((__eisCode == null) != (value == null) || (value != null && ! value.equals(__eisCode)))
        {
            _isDirty = true;
        }
        __eisCode = value;
    }       
    /**
     * Get the value of message  
     */
    public java.lang.String getMessage()
    {
        
        return __message;
    }
    /**
     * Set the value of message  
     */
    public void setMessage(java.lang.String value)
    {
        if ((__message == null) != (value == null) || (value != null && ! value.equals(__message)))
        {
            _isDirty = true;
        }
        __message = value;
    }       
    /**
     * Get the value of component  
     */
    public java.lang.String getComponent()
    {
        
        return __component;
    }
    /**
     * Set the value of component  
     */
    public void setComponent(java.lang.String value)
    {
        if ((__component == null) != (value == null) || (value != null && ! value.equals(__component)))
        {
            _isDirty = true;
        }
        __component = value;
    }       
    /**
     * Get the value of entityKey  
     */
    public java.lang.String getEntityKey()
    {
        
        return __entityKey;
    }
    /**
     * Set the value of entityKey  
     */
    public void setEntityKey(java.lang.String value)
    {
        if ((__entityKey == null) != (value == null) || (value != null && ! value.equals(__entityKey)))
        {
            _isDirty = true;
        }
        __entityKey = value;
    }       
    /**
     * Get the value of operation  
     */
    public java.lang.String getOperation()
    {
        
        return __operation;
    }
    /**
     * Set the value of operation  
     */
    public void setOperation(java.lang.String value)
    {
        if ((__operation == null) != (value == null) || (value != null && ! value.equals(__operation)))
        {
            _isDirty = true;
        }
        __operation = value;
    }       
    /**
     * Get the value of requestId  
     */
    public java.lang.String getRequestId()
    {
        
        return __requestId;
    }
    /**
     * Set the value of requestId  
     */
    public void setRequestId(java.lang.String value)
    {
        if ((__requestId == null) != (value == null) || (value != null && ! value.equals(__requestId)))
        {
            _isDirty = true;
        }
        __requestId = value;
    }       
    /**
     * Get the value of timestamp  
     */
    public java.sql.Timestamp getTimestamp()
    {
        
        return __timestamp;
    }
    /**
     * Set the value of timestamp  
     */
    public void setTimestamp(java.sql.Timestamp value)
    {
        if ((__timestamp == null) != (value == null) || (value != null && ! value.equals(__timestamp)))
        {
            _isDirty = true;
        }
        __timestamp = value;
    }       
    /**
     * Get the value of messageId  
     */
    public long getMessageId()
    {
        
        return __messageId;
    }
    /**
     * Set the value of messageId  
     */
    public void setMessageId(long value)
    {
        if(__messageId != value)
        {
            _isDirty = true;
        }
        __messageId = value;
    }
    
    /**
     * Search mobile business object using surrogateKey
     * @param id surrogateKey
     * @return mobile business object
     */
    public static com.sofos.test.android.LogRecordImpl find(long id)
    {
        String intervalName = null;
        if(com.sybase.mobile.util.perf.impl.PerformanceAgentServiceImpl.isEnabled)
        {
            intervalName = "LogRecordImpl.find()";
            com.sybase.mobile.util.perf.impl.PerformanceAgentServiceImpl.getInstance().startInterval(intervalName, com.sybase.mobile.util.perf.impl.PerformanceAgentServiceImpl.PersistenceRead);
        }
        try
        {
            Object[] keys = new Object[]{id};
            return (com.sofos.test.android.LogRecordImpl)(DELEGATE.findEntityWithKeys(keys));
        }
        finally
        {
            if(com.sybase.mobile.util.perf.impl.PerformanceAgentServiceImpl.isEnabled)
            {
                com.sybase.mobile.util.perf.impl.PerformanceAgentServiceImpl.getInstance().stopInterval(intervalName);
            }
        }
    }
    
    /**
     * Get the mobile business object by surrogate key.
     * @param id surrogate key
     * @return the mobile business object for the surroget key
     * @exception ObjectNotFoundException Thrown if unable to retrieve mobile business object.
     */
    public static com.sofos.test.android.LogRecordImpl load(long id)
    {
        return (com.sofos.test.android.LogRecordImpl)(DELEGATE.load(id));
    }
    
    /**
     * Get surroget key of the mobile business object  
     */
    public java.lang.Long _pk()
    {
        return (java.lang.Long)i_pk();
    }
    
    /** Begin code region: Finder methods **/
    /**
     * return MBO count filter by query object  
     */
    public static int getSize(com.sybase.persistence.Query query)
    {
        return DELEGATE.getSize(query);
    }
    
    /**
     * Find a List of LogRecordImpl
     * @param query The query to be filter.
     * @exception PersistenceException Thrown if unable to retrieve mobile business object.
     */
    public static com.sybase.collections.GenericList<com.sofos.test.android.LogRecordImpl> findWithQuery(com.sybase.persistence.Query query)
    {
        return (com.sybase.collections.GenericList<com.sofos.test.android.LogRecordImpl>)(Object)DELEGATE.findWithQuery(query, com.sofos.test.android.LogRecordImpl.class);
    }
    
    
    
    /**
     * Returns the MBOs that are updated locally but not submitted.  
     */
    public static com.sybase.collections.GenericList<com.sofos.test.android.LogRecordImpl> getPendingObjects(int skip, int take)
    {
        return (com.sybase.collections.GenericList<com.sofos.test.android.LogRecordImpl>)(Object)DELEGATE.getPendingObjects(skip, take);
    }
    /**
     * Returns the MBOs that are updated locally but not submmited.  
     */
    public static com.sybase.collections.GenericList<com.sofos.test.android.LogRecordImpl> getPendingObjects()
    {
        return (com.sybase.collections.GenericList<com.sofos.test.android.LogRecordImpl>)(Object)DELEGATE.getPendingObjects();
    }
    
    /** End code region: Finder methods **/
    
    public com.sybase.collections.GenericList<com.sybase.persistence.LogRecord> getLogRecords()
    {
        return com.sofos.test.android.LogRecordImpl.findByEntity("LogRecordImpl", keyToString());
    }
    
    
    
    
    
    
    
    
    
    public static com.sybase.collections.GenericList<com.sybase.persistence.LogRecord> findByEntity(String entityName, String keyValue)
    {
        com.sybase.persistence.Query _query = com.sybase.persistence.AbstractEntity.getLogRecordQuery(entityName, keyValue);
        com.sybase.collections.GenericList<com.sofos.test.android.LogRecordImpl> _logList = com.sofos.test.android.LogRecordImpl.findWithQuery(_query);
        return (com.sybase.collections.GenericList<com.sybase.persistence.LogRecord>)(Object)_logList;
    }
    
    /**
     * Submit pending operations of the mobile business object (ready for sending to server)  
     */
    public static void submitPendingOperations()
    {
        DELEGATE.submitPendingOperations();
    }
    
    /**
     * Cancel all the pending operations (not submitted operation).  
     */
    public static void cancelPendingOperations()
    {
        DELEGATE.cancelPendingOperations();
    }
    /**
     * Get the last called operation of the mobile business object  
     */
    public String getLastOperation()
    {
        if (getPendingChange() == 'C')
        {
            return "create";
        }
        else if (getPendingChange() == 'D')
        {
            return "delete";
        }
        else if (getPendingChange() == 'U')
        {
            return "update";
        }
        return null;
    }
    
    public com.sofos.test.android.LogRecordImpl getDownloadState()
    {
        return (com.sofos.test.android.LogRecordImpl)i_getDownloadState();
    }
    
    public com.sofos.test.android.LogRecordImpl getOriginalState()
    {
        return (com.sofos.test.android.LogRecordImpl)i_getOriginalState();
    }
}