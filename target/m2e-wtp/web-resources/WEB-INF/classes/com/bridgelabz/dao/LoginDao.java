package com.bridgelabz.dao;

import java.sql.*;

public class LoginDao {

	public static boolean validate(String username, String userpass) {
		boolean status = false;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/form", "root", "password");

			PreparedStatement ps = con.prepareStatement("select * from strut_user where name=? and password=?");
			ps.setString(1, username);
			ps.setString(2, userpass);
			ResultSet rs = ps.executeQuery();
			status = rs.next();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return status;
	}
}