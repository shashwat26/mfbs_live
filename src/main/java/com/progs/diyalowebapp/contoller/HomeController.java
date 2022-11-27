package com.progs.diyalowebapp.contoller;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	String member="/member";
	
	@RequestMapping("/")
	public String getHome()
	{
		System.out.println("working in Controller for index page");
		return "index";
	}
	
	@RequestMapping("member")
	public String getClients()
	{
		String location="Views/Finance/member_entry";
		System.out.println("working in Member Entry page");
		return location;
		
	}
	
	@RequestMapping("loan")
	public String getLoan()
	{
		
		System.out.println("working in Loan Entry page");
		return "Views/Transaction/loan";
	}

}
