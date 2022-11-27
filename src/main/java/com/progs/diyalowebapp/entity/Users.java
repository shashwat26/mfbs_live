package com.progs.diyalowebapp.entity;

public class Users {
	
	@Override
	public String toString() {
		return "Users [user_code=" + user_code + ", password=" + password + "]";
	}
	public Users(String user_code, String password) {
		super();
		this.user_code = user_code;
		this.password = password;
	}
	public String getUser_code() {
		return user_code;
	}
	public void setUser_code(String user_code) {
		this.user_code = user_code;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	private String user_code;
	private String password;

}
