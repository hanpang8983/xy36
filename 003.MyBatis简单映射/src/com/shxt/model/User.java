package com.shxt.model;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable {
	
	private Integer userId;
	private String account;
	private String pwd;
	private String userName;
	private String status;
	
	private Date date1;
	private Date date2;
	
	private Long mydate1;
	
	private String days;
	
	
	public String getDays() {
		return days;
	}
	public void setDays(String days) {
		this.days = days;
	}
	public Long getMydate1() {
		return mydate1;
	}
	public void setMydate1(Long mydate1) {
		this.mydate1 = mydate1;
	}
	public Date getDate2() {
		return date2;
	}
	public void setDate2(Date date2) {
		this.date2 = date2;
	}
	public Date getDate1() {
		return date1;
	}
	public void setDate1(Date date1) {
		this.date1 = date1;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", account=" + account + ", pwd=" + pwd + ", userName=" + userName
				+ ", status=" + status + ", date1=" + date1 + ", date2=" + date2 + ", mydate1=" + mydate1 + ", days="
				+ days + "]";
	}

	
	
	

}
