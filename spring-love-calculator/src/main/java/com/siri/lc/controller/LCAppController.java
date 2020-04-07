package com.siri.lc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.siri.lc.api.UserInfoDTO;

@Controller
public class LCAppController {

	@RequestMapping("/")
	public String showHomePage(@ModelAttribute("userinfo") UserInfoDTO userInfoDto)
	{
		//we can write these two line in a simgle line way
		//UserInfoDTO userInfoDto=new UserInfoDTO();
		//model.addAttribute("userinfo", userInfoDto);
		return "home-page";
	}
	/*//param name should match with form field name
	@RequestMapping("/process-homepage")
	public String showResultPage(@RequestParam("username") String username1,@RequestParam("crushname") String crushname1,Model model)
	{
		//System.out.println("your name:"+username1);
		//System.out.println("your name:"+crushname1);
		model.addAttribute("UserName", username1);
		model.addAttribute("CrushName", crushname1);
		
		return "resut-page";
	}*/
	@RequestMapping("/process-homepage")
	public String showResultPage(@ModelAttribute("userinfo") UserInfoDTO userInfoDto)
	{
		//System.out.println("your name:"+username1);
		//System.out.println("your name:"+crushname1);
		//model.addAttribute("UserName", userInfoDto.getUsername());
		//model.addAttribute("CrushName",userInfoDto.getCrushname() );
		//model.addAttribute("userInfoDto", userInfoDto);
		
		return "resut-page";
	}
}
