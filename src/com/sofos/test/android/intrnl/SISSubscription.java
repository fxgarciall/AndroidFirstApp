/**
 * Generated by Sybase AFX Compiler with templateJ
 * Compiler version - 2.3.2.380
 * mbs - false 
 */
package com.sofos.test.android.intrnl;

@SuppressWarnings("all")
public  class SISSubscription extends com.sybase.sup.client.persistence.SISSubscription implements com.sybase.reflection.ClassWithMetaData
{
    /** Begin code region: MetaData **/
    private static com.sofos.test.android.intrnl.SISSubscriptionMetaData META_DATA = new com.sofos.test.android.intrnl.SISSubscriptionMetaData();
    
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
        com.sybase.sup.client.persistence.DelegateFactory.createEntityDelegate("SISSubscription", com.sofos.test.android.intrnl.SISSubscription.class, "AndroidMobileAppTest.SISSubscription", META_DATA, com.sofos.test.android.AndroidMobileAppTestDB.getDelegate());
}