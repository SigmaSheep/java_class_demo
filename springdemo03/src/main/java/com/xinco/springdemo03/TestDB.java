package com.xinco.springdemo03;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestDB {

	public static void main(String[] args) {
		
		String jdbcUrl = "jdbc:mysql://localhost:3306/hibernate_demo_01?useSSL=false&serverTimezone=UTC";

		String user = "studentdemo";
		String password = "studentdemo";
	
		try {
			System.out.println("Connecting to DB: " + jdbcUrl);
			
			Connection conn = DriverManager.getConnection(jdbcUrl, user, password);
						
			System.out.println("Connection suceess!");
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
