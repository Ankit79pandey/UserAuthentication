package com.simplilearn.security.Models;



public class User {


	int id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	String username;
	String password;
	String role;

	public String getUsername() {
		return username;
	}
	public User(int id,String username, String password, String role) {
		super();
	
		this.id=id;
		this.username = username;
		this.password = password;
		this.role = role;
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
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
}
