package com.siri.lc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.siri.lc.api.UserRegistrationDTO;

@Controller
public class RegistrationController {

	@RequestMapping("/register")
	public String showRegistrationPage(@ModelAttribute("userReg") UserRegistrationDTO userRegDto)
	{
		return "user-registration-page";
	}
	
	@RequestMapping("/registration-sucess")
	public String processUserReg(@ModelAttribute("userReg") UserRegistrationDTO userRgDto)
	{
		return "regristration-sucess";
	}
}
