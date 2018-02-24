package com.thj.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

import com.alibaba.druid.pool.DruidDataSource;

/**
 *@author thj
 *@time	  2018-02-23 11:40:42
 */
@Configuration
public class DruidConfig {

	@Value("${db.url}")  
    private String dbUrl;   
    @Value("${db.username}")  
    private String username;  
    @Value("${db.password}")  
    private String password;  
    @Value("${db.mysql.driver}")  
    private String driverClassName;  
//    @Value("${spring.datasource.url}")  
//    private String dbUrl;   
//    @Value("${spring.datasource.username}")  
//    private String username;  
//    @Value("${spring.datasource.password}")  
//    private String password;  
//    @Value("${spring.datasource.driver.class.name}")  
//    private String driverClassName;  

    public DataSource dataSource(){  
        DruidDataSource datasource = new DruidDataSource();  
        datasource.setUrl(this.dbUrl);  
        datasource.setUsername(username);  
        datasource.setPassword(password);  
        datasource.setDriverClassName(driverClassName);  
        return datasource;  
    }  
}
