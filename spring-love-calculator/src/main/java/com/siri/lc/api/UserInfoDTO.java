package com.siri.lc.api;

import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class UserInfoDTO {

	//variable names should be same as form field names
	@NotBlank(message="*your name should not be blank")
	//@Min(value=3,message="*your name should contain atleast 3 chars")
	@Size(min=3,max=15,message="your name should contain char between 3-15")
	private String username;
	
	@NotBlank(message="*crush  name should not be blank")
	@Size(min=3,max=15,message="*crush name should contain char between 3-15")
	private String crushname;
	
	@AssertTrue(message="*click agree to use our app")
	private boolean termsandcondition;
	
	public boolean isTermsandcondition() {
		return termsandcondition;
	}
	public void setTermsandcondition(boolean termsandcondition) {
		this.termsandcondition = termsandcondition;
	}
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
