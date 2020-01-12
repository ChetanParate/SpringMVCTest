package com.sears.hcm.dao;

import java.sql.Connection;

import javax.security.auth.login.LoginException;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Component("login")
public class LoginImpl implements ILogin {
	
	private DataSource dataSource;
	private Connection con =null;
	
	@Autowired
	@Qualifier("dataSource")
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	public void chekUser(String name, String password) throws LoginException {
		
		System.out.println("chekUser Method is called..");
		try{
			con = dataSource.getConnection();
			System.out.println("Connection successfully Done...");
					
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			
			try{
				if(con!=null){
				con.close();
				}
			}catch(Exception e){
				e.printStackTrace();
			}
		}
			
		}
	}
