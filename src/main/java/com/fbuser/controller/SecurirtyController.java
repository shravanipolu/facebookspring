package com.fbuser.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SecurirtyController {

	@RequestMapping(value="/goToLogin")
	public String goToLogin() {

		return "login";
	}
	@RequestMapping(value="/loginFail")
	public String loginFail(Model m){
	m.addAttribute("message","invalid Credentials!!");
		
		return "login";
	}
	@RequestMapping(value="/defaultTargetPage")
	public String defaultPage(){
		return"success";
	}
	@RequestMapping(value="/logOutUser")
	public String logoutUser(){
		return "login";
	}
	@RequestMapping(value="/accessDeniedPage")
	public String accessDeniedPage(Model m){
		m.addAttribute("message","you do not have access this action");
		return "success";
	}
	
	
}
