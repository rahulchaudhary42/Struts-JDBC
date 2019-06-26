package com.birdgelabz.action;

import com.bridgelabz.dao.ForgetDao;

public class ForgetAction {
	private String username;
	private String password;
	private String confirmPassword;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getConfirmPassword() {
		return confirmPassword;
	}
	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}
	
	public String execute() {
		boolean i=ForgetDao.forget(username, password, confirmPassword);
		if(i)
			return "success";
		else
			return "error"; 
	}

}
