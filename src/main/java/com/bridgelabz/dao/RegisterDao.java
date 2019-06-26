package com.bridgelabz.dao;

import java.sql.*;

import com.birdgelabz.action.RegisterAction;

public class RegisterDao {

	public static int save(RegisterAction r) {
		int status = 0;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/form", "root", "password");

			PreparedStatement ps = con.prepareStatement("insert into strut_user values(?,?,?,?,?)");
			ps.setString(1, r.getName());
			ps.setString(2, r.getPassword());
			ps.setString(3, r.getEmail());
			ps.setString(4, r.getMobile());
			ps.setString(5, r.getAddress());

			status = ps.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return status;
	}
}