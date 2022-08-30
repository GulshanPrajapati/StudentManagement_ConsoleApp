package com.gulshan.student.manage;

import java.sql.Connection;
import java.sql.DriverManager;

public class Connection_con {
	static Connection con; 
	public static Connection createC(){
		
		try {
			//Load the Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			
			// Create Connection
			String user = "root";
			String password = "root";
			String url = "jdbc:mysql://localhost:3306/gulshan";
			con = DriverManager.getConnection(url,user,password);
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return con;
	}

}
