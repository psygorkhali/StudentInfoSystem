package com.dilraj.jdbcdemo.usingstatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class inserDemo {
	public static void main(String[] args) {
		String sql = "INSERT into user(name, age) values('shruti', 28)";
		// TODO Auto-generated method stub
		//1. register the driver
		Connection con = null;
		Statement ps = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			//2. obtain the connection object using DriveManagerClass
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "root", "naksatra3");
			//3. obtain preparedstatement object using connection 
			ps = con.createStatement();
			//4. excetue the query
			ps.executeUpdate(sql);
			System.out.println("connected");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				con.close();
				ps.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
