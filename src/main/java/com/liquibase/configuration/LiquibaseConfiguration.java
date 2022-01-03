package com.liquibase.configuration;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import liquibase.integration.spring.SpringLiquibase;

//package com.rakuten.rcp.paas.manager.common.configurations;
//
//import javax.sql.DataSource;
//
//import org.springframework.boot.autoconfigure.liquibase.LiquibaseDataSource;
//import org.springframework.boot.jdbc.DataSourceBuilder;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.core.env.Environment;
//import org.springframework.stereotype.Component;
//
//import com.zaxxer.hikari.HikariDataSource;
//
//import lombok.AllArgsConstructor;
//
////@Configuration
////@ConditionalOnProperty(prefix = "spring.liquibase", name = "enabled", matchIfMissing = true)
////@EnableConfigurationProperties(LiquibaseProperties.class)
////@AllArgsConstructor
////public class DataSourceConfiguration {
////
////    private LiquibaseProperties properties;
////    private DataSourceProperties dataSourceProperties;
////
////    @Bean
////    public MultiTenantDataSourceSpringLiquibase liquibaseMultiTenancy(Map<Object, Object> dataSources,
////                                                                      @Qualifier("taskExecutor") TaskExecutor taskExecutor) {
////        // to run changeSets of the liquibase asynchronous
////        MultiTenantDataSourceSpringLiquibase liquibase = new MultiTenantDataSourceSpringLiquibase(taskExecutor);
////        dataSources.forEach((tenant, dataSource) -> liquibase.addDataSource((String) tenant, (DataSource) dataSource));
////        dataSourceProperties.getDataSources().forEach(dbProperty -> {
////            if (dbProperty.getLiquibase() != null) {
////                liquibase.addLiquibaseProperties(dbProperty.getTenantId(), dbProperty.getLiquibase());
////            }
////        });
////        liquibase.addDataSource((String) tenant, (DataSource) dataSource)
////        liquibase.setContexts(properties.getContexts());
////        liquibase.setChangeLog(properties.getChangeLog());
////        liquibase.setDefaultSchema(properties.getDefaultSchema());
////        liquibase.setDropFirst(properties.isDropFirst());
////        liquibase.setShouldRun(properties.isEnabled());
////        return liquibase;
////    }
////
////}
//
//@AllArgsConstructor
//@Configuration
//public class DataSourceConfiguration {
//
////    @Autowired
////    private LiquibaseProperties dataSourceProperties;
//    
//    private final Environment env;
//
//    @LiquibaseDataSource
//    @Bean
//    public DataSource liquibaseDataSource() {
//        DataSource ds = DataSourceBuilder.create()
//                .username(env.getRequiredProperty("spring.liquibase.user"))
//                .password(env.getRequiredProperty("spring.liquibase.password"))
//                .url(env.getRequiredProperty("spring.liquibase.url"))
//                .build();
//        if (ds instanceof HikariDataSource) {
//            ((HikariDataSource) ds).setMaximumPoolSize(Integer.valueOf(env.getRequiredProperty("spring.datasource.hikari.maximum-pool-size")));
//            ((HikariDataSource) ds).setPoolName("Liquibase Pool");
//        }
//        return ds;
//    }
//    
////	@Bean(initMethod = "migrate")
////	public Liquibase flyway() {
////		return new Liquibase()
////				env.getRequiredProperty("spring.flyway.url"), env.getRequiredProperty("spring.flyway.user"),
////				env.getRequiredProperty("spring.flyway.password")));
////	}
//}

