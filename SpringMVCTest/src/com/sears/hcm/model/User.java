package com.sears.hcm.model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class User {
	
	@Size(min = 2, max = 20, message="should be min 2 to 20 char")
	@NotNull(message="username is required")
	private String userName;
	
	@Size(min=8)
	@NotNull(message="password is required ")
	private String userPassword;
	
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	
	

}
