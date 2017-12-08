package com.dilraj.jdbcdemo.usingpreparedstatement;

import java.sql.*;

public class inserDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sql = "insert into user(name, age)values(?,?)";
		Connection con = null;
		PreparedStatement ps = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "root","naksatra3");
			ps = con.prepareStatement(sql);
			ps.setString(1, "dengue");
			ps.setInt(2, 50);
			
			ps.executeUpdate();
			System.out.println("connected");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
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
