/**
 * Generated by Sybase AFX Compiler with templateJ
 * Compiler version - 2.3.2.380
 * mbs - false 
 */  
package com.sofos.test.android.intrnl;

@SuppressWarnings("all")
public class KeyGeneratorMetaData extends com.sybase.reflection.EntityMetaDataEx
{
    /**
     * Sybase internal use only.
     */
    public KeyGeneratorMetaData()
    {
        super(com.sofos.test.android.AndroidMobileAppTestDB.getMetaData());
        _init();
    }
    protected void _init()
    {
        setId(2);
        setAttributes(new com.sybase.reflection.AttributeMetaDataList());
        setAttributeMap(new com.sybase.reflection.AttributeMap());
        com.sybase.reflection.AttributeMetaData firstId_attribute = addAttributeWithParams
        	(496, "firstId", "long", 
        	-1, 
        	false, false, true, false, false, 
        	false,false, 
        	"\"first_id\"", "bigint", "", 0, 0, 
        	com.sybase.reflection.AttributeMetaData.GENERATED_SCHEME.NONE,
        	"", "null", com.sybase.reflection.PersonalizationMetaData.PersonalizationType.None,
        	false, false, false);
        com.sybase.reflection.AttributeMetaData lastId_attribute = addAttributeWithParams
        	(497, "lastId", "long", 
        	-1, 
        	false, false, true, false, false, 
        	false,false, 
        	"\"last_id\"", "bigint", "", 0, 0, 
        	com.sybase.reflection.AttributeMetaData.GENERATED_SCHEME.NONE,
        	"", "null", com.sybase.reflection.PersonalizationMetaData.PersonalizationType.None,
        	false, false, false);
        com.sybase.reflection.AttributeMetaData nextId_attribute = addAttributeWithParams
        	(498, "nextId", "long", 
        	-1, 
        	false, false, true, false, false, 
        	false,false, 
        	"\"next_id\"", "bigint", "", 0, 0, 
        	com.sybase.reflection.AttributeMetaData.GENERATED_SCHEME.NONE,
        	"", "null", com.sybase.reflection.PersonalizationMetaData.PersonalizationType.None,
        	false, false, false);
        com.sybase.reflection.AttributeMetaData remoteId_attribute = addAttributeWithParams
        	(494, "remoteId", "string", 
        	300, 
        	false, true, true, false, false, 
        	false,false, 
        	"\"remote_id\"", "varchar(300)", "", 0, 0, 
        	com.sybase.reflection.AttributeMetaData.GENERATED_SCHEME.NONE,
        	"", "null", com.sybase.reflection.PersonalizationMetaData.PersonalizationType.None,
        	false, false, false);
        com.sybase.reflection.AttributeMetaData batchId_attribute = addAttributeWithParams
        	(495, "batchId", "long", 
        	-1, 
        	false, true, true, false, false, 
        	false,false, 
        	"\"batch_id\"", "bigint", "", 0, 0, 
        	com.sybase.reflection.AttributeMetaData.GENERATED_SCHEME.NONE,
        	"", "null", com.sybase.reflection.PersonalizationMetaData.PersonalizationType.None,
        	false, false, false);
        initAttributeMapFromAttributes();
        setName("KeyGenerator");
        setTable("\"androidmobileapptest_1_0_keygenerator\"");
        setSynchronizationGroup("system");
        this.getKeyAttributes().add((remoteId_attribute));
        this.getKeyAttributes().add((batchId_attribute));
        this.setKeyClass("KeyGeneratorPK");
    }
    
    /**
     * Sybase internal use only.
     */
    public  boolean isEntity()
    {
        return true;
    }
    
    /**
     * Sybase internal use only.
     */
    public  boolean isService()
    {
        return false;
    }
}