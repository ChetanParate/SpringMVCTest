package com.sears.hcm.dao;

import javax.security.auth.login.LoginException;

public interface ILogin {
	
	public void chekUser(String name, String password) throws LoginException;

}
