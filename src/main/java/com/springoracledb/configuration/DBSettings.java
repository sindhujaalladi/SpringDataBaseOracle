package com.springoracledb.configuration;
import java.sql.SQLException;

import javax.sql.DataSource;
import javax.validation.constraints.NotNull;
import oracle.jdbc.pool.OracleDataSource;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import lombok.Getter;
import lombok.Setter;


@Setter
@Getter
@Configuration
@ConfigurationProperties(prefix = "spring.datasource")
public class DBSettings {
	
	@NotNull
	private String username;
	
	@NotNull
	private String password;
	
	@NotNull
	private String url;
	
    private String driver_class_name;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getDriver_class_name() {
		return driver_class_name;
	}

	public void setDriver_class_name(String driver_class_name) {
		this.driver_class_name = driver_class_name;
	}
    
    
    }
