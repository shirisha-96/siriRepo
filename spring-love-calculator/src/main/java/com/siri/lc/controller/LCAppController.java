package com.siri.lc.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.siri.lc.api.UserInfoDTO;

@Controller
public class LCAppController {

	@RequestMapping("/")
	public String showHomePage(@ModelAttribute("userinfo") UserInfoDTO userInfoDto)
	{
		//we can write these two lines in a single line
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
		
		return "result-page";
	}*/
	@RequestMapping("/process-homepage")
	public String showResultPage(@Valid @ModelAttribute("userinfo") UserInfoDTO userInfoDto,BindingResult result)
	{
		//System.out.println("your name:"+username1);
		//System.out.println("your name:"+crushname1);
		//model.addAttribute("UserName", userInfoDto.getUsername());
		//model.addAttribute("CrushName",userInfoDto.getCrushname() );
		//model.addAttribute("userInfoDto", userInfoDto);
		if(result.hasErrors())
		{
			System.out.println("form has errors....");
			List<ObjectError> allerrors=result.getAllErrors();
			for(ObjectError error:allerrors)
			{
				System.out.println(error);
			}
			return "home-page";
		}
		return "resut-page";
	}
}
