package com.shxt.model;

public class User {
	
	private String account;
	private String user_name;
	private String role_name;
	
	private Role fkRole;
	
	
	public String getRole_name() {
		return role_name;
	}
	public void setRole_name(String role_name) {
		this.role_name = role_name;
	}
	public Role getFkRole() {
		return fkRole;
	}
	public void setFkRole(Role fkRole) {
		this.fkRole = fkRole;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	@Override
	public String toString() {
		return "User [account=" + account + ", user_name=" + user_name + ", role_name=" + role_name + ", fkRole="
				+ fkRole + "]";
	}
	
	
	

}
