package com.springoracledb.configuration;

import com.springoracledb.configuration.DBSettings;

import oracle.jdbc.pool.OracleDataSource;

import java.sql.SQLException;

import javax.sql.DataSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OracleConfiguration {
	
	@Autowired
	private DBSettings dbSettings;
	
	
    Logger logger = LoggerFactory.getLogger(OracleConfiguration.class);
    
    @Bean
    public DataSource dataSource() throws SQLException{
        OracleDataSource ds = new OracleDataSource();
        ds.setDriverType(dbSettings.getDriver_class_name());
        logger.info("Using Driver " + dbSettings.getDriver_class_name());
        ds.setURL(dbSettings.getUrl());
        logger.info("Using URL: " + dbSettings.getUrl());
        ds.setUser(dbSettings.getUsername());
        logger.info("Using Username: " + dbSettings.getUsername());
        ds.setPassword(dbSettings.getPassword());
        return ds;


}
}
