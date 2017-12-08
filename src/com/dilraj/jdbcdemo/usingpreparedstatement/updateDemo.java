package com.dilraj.jdbcdemo.usingpreparedstatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class updateDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sql = "update user set name=?,age=? where id=?";
		Connection con = null;
		PreparedStatement ps = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "root","naksatra3");
			ps = con.prepareStatement(sql);
			ps.setString(1, "danger");
			ps.setInt(2, 15);
			ps.setInt(3, 1);
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
