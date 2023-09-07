package com.crud;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan("jdbctemplate")
@PropertySource("classpath:database.properties")
public class AppConfiguration {

	@Autowired
	Environment env;

	@Bean
	DataSource dataSource() {
		DriverManagerDataSource driver = new DriverManagerDataSource();
		driver.setUrl(env.getProperty("url"));
		driver.setUsername(env.getProperty("dbuser"));
		driver.setPassword(env.getProperty("dbpassword"));
		driver.setDriverClassName(env.getProperty("driver"));

		return driver;

	}

}