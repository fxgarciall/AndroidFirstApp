package com.sofos.test.android.intrnl;

public  class AndroidMobileAppTestDBMetaData extends com.sybase.reflection.DatabaseMetaData
{
    /**
     * Sybase internal use only.
     */
    public AndroidMobileAppTestDBMetaData(com.sybase.sup.client.persistence.DatabaseDelegate dbDelegate)
    {
        this.setDelegate(dbDelegate);
        _init();	
    }
    
    protected void _init()
    {
        setId(9);
        setAttributes(new com.sybase.reflection.AttributeMetaDataList());
        setAttributeMap(new com.sybase.reflection.AttributeMap());
        initAttributeMapFromAttributes();
        setName("AndroidMobileAppTestDB");
        com.sybase.reflection.ClassMetaDataList _classList = new com.sybase.reflection.ClassMetaDataList(20);
        com.sybase.reflection.ClassMap _classMap = new com.sybase.reflection.ClassMap();
        setClassList(_classList);
        setClassMap(_classMap);
        com.sofos.test.android.intrnl.CustomerMetaData _CustomerMetaData = (com.sofos.test.android.intrnl.CustomerMetaData)(com.sofos.test.android.Customer.getMetaData());
        _classList.add(_CustomerMetaData);
        _classMap.add("Customer", _CustomerMetaData);
        com.sofos.test.android.intrnl.LogRecordImplMetaData _LogRecordImplMetaData = (com.sofos.test.android.intrnl.LogRecordImplMetaData)(com.sofos.test.android.LogRecordImpl.getMetaData());
        _classList.add(_LogRecordImplMetaData);
        _classMap.add("LogRecordImpl", _LogRecordImplMetaData);
        com.sofos.test.android.intrnl.OperationReplayMetaData _OperationReplayMetaData = (com.sofos.test.android.intrnl.OperationReplayMetaData)(com.sofos.test.android.intrnl.OperationReplay.getMetaData());
        _classList.add(_OperationReplayMetaData);
        _classMap.add("OperationReplay", _OperationReplayMetaData);
        com.sofos.test.android.intrnl.SISSubscriptionKeyMetaData _SISSubscriptionKeyMetaData = (com.sofos.test.android.intrnl.SISSubscriptionKeyMetaData)(com.sofos.test.android.intrnl.SISSubscriptionKey.getMetaData());
        _classList.add(_SISSubscriptionKeyMetaData);
        _classMap.add("SISSubscriptionKey", _SISSubscriptionKeyMetaData);
        com.sofos.test.android.intrnl.SISSubscriptionMetaData _SISSubscriptionMetaData = (com.sofos.test.android.intrnl.SISSubscriptionMetaData)(com.sofos.test.android.intrnl.SISSubscription.getMetaData());
        _classList.add(_SISSubscriptionMetaData);
        _classMap.add("SISSubscription", _SISSubscriptionMetaData);
        com.sofos.test.android.intrnl.PackagePropertiesMetaData _PackagePropertiesMetaData = (com.sofos.test.android.intrnl.PackagePropertiesMetaData)(com.sofos.test.android.PackageProperties.getMetaData());
        _classList.add(_PackagePropertiesMetaData);
        _classMap.add("PackageProperties", _PackagePropertiesMetaData);
        com.sofos.test.android.intrnl.ChangeLogKeyMetaData _ChangeLogKeyMetaData = (com.sofos.test.android.intrnl.ChangeLogKeyMetaData)(com.sofos.test.android.ChangeLogKey.getMetaData());
        _classList.add(_ChangeLogKeyMetaData);
        _classMap.add("ChangeLogKey", _ChangeLogKeyMetaData);
        com.sofos.test.android.intrnl.ChangeLogImplMetaData _ChangeLogImplMetaData = (com.sofos.test.android.intrnl.ChangeLogImplMetaData)(com.sofos.test.android.ChangeLogImpl.getMetaData());
        _classList.add(_ChangeLogImplMetaData);
        _classMap.add("ChangeLogImpl", _ChangeLogImplMetaData);
        com.sofos.test.android.intrnl.OfflineAuthenticationMetaData _OfflineAuthenticationMetaData = (com.sofos.test.android.intrnl.OfflineAuthenticationMetaData)(com.sofos.test.android.OfflineAuthentication.getMetaData());
        _classList.add(_OfflineAuthenticationMetaData);
        _classMap.add("OfflineAuthentication", _OfflineAuthenticationMetaData);
        com.sofos.test.android.intrnl.KeyPackageNameMetaData _KeyPackageNameMetaData = (com.sofos.test.android.intrnl.KeyPackageNameMetaData)(com.sofos.test.android.KeyPackageName.getMetaData());
        _classList.add(_KeyPackageNameMetaData);
        _classMap.add("KeyPackageName", _KeyPackageNameMetaData);
        com.sofos.test.android.intrnl.PersonalizationParametersMetaData _PersonalizationParametersMetaData = (com.sofos.test.android.intrnl.PersonalizationParametersMetaData)(com.sofos.test.android.PersonalizationParameters.getMetaData());
        _classList.add(_PersonalizationParametersMetaData);
        _classMap.add("PersonalizationParameters", _PersonalizationParametersMetaData);
        com.sofos.test.android.intrnl.KeyGeneratorMetaData _KeyGeneratorMetaData = (com.sofos.test.android.intrnl.KeyGeneratorMetaData)(com.sofos.test.android.KeyGenerator.getMetaData());
        _classList.add(_KeyGeneratorMetaData);
        _classMap.add("KeyGenerator", _KeyGeneratorMetaData);
        com.sofos.test.android.intrnl.LocalKeyGeneratorMetaData _LocalKeyGeneratorMetaData = (com.sofos.test.android.intrnl.LocalKeyGeneratorMetaData)(com.sofos.test.android.LocalKeyGenerator.getMetaData());
        _classList.add(_LocalKeyGeneratorMetaData);
        _classMap.add("LocalKeyGenerator", _LocalKeyGeneratorMetaData);
        com.sybase.reflection.EntityMetaDataList _entityList = new com.sybase.reflection.EntityMetaDataList(20);
        com.sybase.reflection.EntityMap _entityMap = new com.sybase.reflection.EntityMap();
        setEntityList(_entityList);
        setEntityMap(_entityMap);
        _entityList.add(_LocalKeyGeneratorMetaData);
        _entityMap.add("LocalKeyGenerator", _LocalKeyGeneratorMetaData);
        _entityList.add(_OfflineAuthenticationMetaData);
        _entityMap.add("OfflineAuthentication", _OfflineAuthenticationMetaData);
        _entityList.add(_KeyGeneratorMetaData);
        _entityMap.add("KeyGenerator", _KeyGeneratorMetaData);
        _entityList.add(_ChangeLogImplMetaData);
        _entityMap.add("ChangeLogImpl", _ChangeLogImplMetaData);
        _entityList.add(_PackagePropertiesMetaData);
        _entityMap.add("PackageProperties", _PackagePropertiesMetaData);
        _entityList.add(_SISSubscriptionMetaData);
        _entityMap.add("SISSubscription", _SISSubscriptionMetaData);
        _entityList.add(_OperationReplayMetaData);
        _entityMap.add("OperationReplay", _OperationReplayMetaData);
        _entityList.add(_LogRecordImplMetaData);
        _entityMap.add("LogRecordImpl", _LogRecordImplMetaData);
        _entityList.add(_CustomerMetaData);
        _entityMap.add("Customer", _CustomerMetaData);
        com.sybase.collections.StringList _publications = new com.sybase.collections.StringList(20);
        com.sybase.reflection.EntityListMap _publicationsToEntities = new com.sybase.reflection.EntityListMap();
        _publications.add("default");
        com.sybase.reflection.EntityMetaDataList defaultEntities = new com.sybase.reflection.EntityMetaDataList(20);
        defaultEntities.add(_CustomerMetaData);
        defaultEntities.add(_LogRecordImplMetaData);
        defaultEntities.add(_OperationReplayMetaData);
        defaultEntities.add(_SISSubscriptionMetaData);
        defaultEntities.add(_PackagePropertiesMetaData);
        defaultEntities.add(_ChangeLogImplMetaData);
        defaultEntities.add(_KeyGeneratorMetaData);
        _publicationsToEntities.add("default", defaultEntities);
        _publications.add("unsubscribe");
        com.sybase.reflection.EntityMetaDataList unsubscribeEntities = new com.sybase.reflection.EntityMetaDataList(20);
        unsubscribeEntities.add(_KeyGeneratorMetaData);
        _publicationsToEntities.add("unsubscribe", unsubscribeEntities);
        _publications.add("system");
        com.sybase.reflection.EntityMetaDataList systemEntities = new com.sybase.reflection.EntityMetaDataList(20);
        systemEntities.add(_LogRecordImplMetaData);
        systemEntities.add(_OperationReplayMetaData);
        systemEntities.add(_SISSubscriptionMetaData);
        systemEntities.add(_PackagePropertiesMetaData);
        systemEntities.add(_KeyGeneratorMetaData);
        _publicationsToEntities.add("system", systemEntities);
        _publications.add("initialSync");
        com.sybase.reflection.EntityMetaDataList initialSyncEntities = new com.sybase.reflection.EntityMetaDataList(20);
        initialSyncEntities.add(_PackagePropertiesMetaData);
        initialSyncEntities.add(_KeyGeneratorMetaData);
        _publicationsToEntities.add("initialSync", initialSyncEntities);
        setDatabaseFile("androidMobileAppTest1_0.ulj");
        setDatabaseName("androidMobileAppTest1_0");
        initEntityListMap(_publicationsToEntities);
        setSynchronizationGroups(_publications);
    }
    
    
    /**
     * Sybase internal use only.
     */
    public  boolean isEntity()
    {
        return false;
    }
    
    /**
     * Sybase internal use only.
     */
    public  boolean isService()
    {
        return false;
    }
}