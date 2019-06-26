package com.birdgelabz.action;

import com.bridgelabz.dao.RegisterDao;

public class RegisterAction {

	private String name, password, email, mobile, address;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "RegisterController [name=" + name + ", password=" + password + ", email=" + email + ", mobile=" + mobile
				+ ", address=" + address + "]";
	}

	public String execute() {
		int i = RegisterDao.save(this);
		if (i > 0) {
			return "success";
		}
		return "error";
	}
}