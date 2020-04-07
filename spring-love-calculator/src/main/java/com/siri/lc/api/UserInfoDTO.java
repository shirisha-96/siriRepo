package com.siri.lc.api;

public class UserInfoDTO {

	//variable names should be same as form field names
	private String username="Mr x";
	private String crushname="Miss y";
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getCrushname() {
		return crushname;
	}
	public void setCrushname(String crushname) {
		this.crushname = crushname;
	}
	@Override
	public String toString() {
		return "UserInfoDTO [username=" + username + ", crushname=" + crushname + "]";
	}
	
}
