package com.gos.model;

public class User {
	
	private Integer id;
	private String loginId;
	private String pwd;
	
	
	@Override
	public String toString() {
		return "User [id=" + id + ", loginId=" + loginId + ", pwd=" + pwd + "]";
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getLoginId() {
		return loginId;
	}
	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
}
