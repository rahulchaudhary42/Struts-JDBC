


package com.bridgelabz.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class ForgetDao {
	public static boolean forget(String username, String password, String conformPassword) {
		try {
			if(password.equals(conformPassword)) {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/form", "root", "password");
			//update strut_user set password = ? where name = ?;
			PreparedStatement ps = con.prepareStatement("update strut_user set password = ? where name = ?");
			ps.setString(1, password);
			ps.setString(2, username);
			int i = ps.executeUpdate();
			if(i != 0) {
				return true;
			}else {
				return false;
			}
			}else {
				return false;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return true;
	}
}