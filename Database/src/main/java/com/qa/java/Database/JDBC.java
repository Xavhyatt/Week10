package com.qa.java.Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC {

	public static void main(String[]args) {
			
	Connection conn = null;
	Statement stmt = null;
	
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/QAC","root","password");
		stmt = conn.createStatement();
		
		String sql1;
		sql1 = "DELETE From QAC where RegNo=5"; 
		stmt.executeUpdate(sql1);
		
		
		String sql;
		sql = "SELECT * From QAC";
		ResultSet rs = stmt.executeQuery(sql);
		while(rs.next()==true) {
			System.out.println("RegNo: " + rs.getInt(1));
			System.out.println("Name: " + rs.getString("Name"));
			System.out.println("Marks: " + rs.getInt("Marks"));
			System.out.println("");
		}		
		rs.close();
		stmt.close();
		conn.close();
		
	} catch(SQLException se) {
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
}

