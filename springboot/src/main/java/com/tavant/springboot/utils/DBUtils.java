package com.tavant.springboot.utils;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import com.zaxxer.hikari.HikariDataSource;

//@Configuration
//@PropertySource("classpath:application.properties")
public class DBUtils {
//	
////	@Autowired
////	Environment environment;
//	
//
//	@Bean
//	@ConfigurationProperties("spring.datasource.hikari")
//	public DataSource getDataSource() {
//		
//		return DataSourceBuilder.create().type(HikariDataSource.class).build();
//		
//	}
//	public void closeConnection(Connection connection) {
//
//		try {
//			connection.close();
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
//
//	public Connection getConnection() {
//		// we need to load the driver
//		// DriverManager to get the connection object
//		// r we following the datasource approach?
//		Connection connection = null;
//		try {
//			if(this.getDataSource()!=null) {
//				System.out.println("hikari datasource");
//			}
//			 connection = this.getDataSource().getConnection();
//			 return connection;
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		return null;
//	}
}
