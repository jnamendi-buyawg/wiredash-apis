package com.awg.wiredash_apis.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;

@Configuration
public class DataSourceConfiguration {
	
   @Bean
   @Primary 
   public SQLServerDataSource getDataSource() {
    	SQLServerDataSource ds = new SQLServerDataSource();
        ds.setServerName("orisqnmw76hu5iuz67xlpa3t5a-iyslpm74fxqehcusupnitvaezm.datawarehouse.fabric.microsoft.com");
        ds.setDatabaseName("LAKE_Dynamics365AWG_UAT");
        ds.setUser("");
        ds.setPassword("");
        ds.setAuthentication("ActiveDirectoryServicePrincipal");       
        ds.setTrustServerCertificate(true);
        return ds;
    }
}
