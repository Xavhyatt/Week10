package com.qa.java.BankProject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class BankMethods {

	static Connection conn = null;
	static Statement stmt = null;

	public void createAccount(String name, String address) {
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/BankofXav","root","password");
			stmt = conn.createStatement();
			
			String sql = "INSERT into BankofXav values(" + name + "," + address +")"; 
			stmt.executeUpdate(sql);
			
			stmt.close();
			conn.close();
		} catch (Exception se) {
		
		}
	}
}
