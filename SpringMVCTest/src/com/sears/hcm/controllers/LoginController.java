package com.sears.hcm.controllers;

import javax.security.auth.login.LoginException;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sears.hcm.dao.ILogin;
import com.sears.hcm.model.User;



@Controller
public class LoginController {
	
	private ILogin login;
	
	@Autowired
	@Qualifier("login")
	public void setLogin(ILogin login) {
		this.login = login;
	}
	
	@RequestMapping("login.do")
	/* By parameter */
	//public String login(@RequestParam("username") String username, @RequestParam("password" )String password) throws LoginException{
	/* By model class */
	public String login(@ModelAttribute("user") @Valid User user, BindingResult result)throws LoginException{	
		
		if(result.hasErrors()){
			System.out.println(result.getAllErrors());
			return "login";
		}
		System.out.println("**** Login Called ****");
		System.out.println("UserName :"+user.getUserName());
		System.out.println("Password :"+user.getUserPassword()); 
		System.out.println(login);
		
		//throw new LoginException();
		return "success";
	}
	
	//for json object
	@RequestMapping(value="login1.do", method = RequestMethod.POST,
			consumes="application/json", produces="application/json")
	public @ResponseBody User login1(@RequestBody @Valid User user, BindingResult result) throws LoginException{
		System.out.println("**** Login Called ****");
		System.out.println("UserName :"+user.getUserName());
		System.out.println("Password :"+user.getUserPassword());
		return user;
	}
	
}
