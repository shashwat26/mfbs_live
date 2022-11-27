package com.progs.diyalowebapp.contoller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.progs.diyalowebapp.entity.User;


@Controller
public class LoginController {
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String getLogin() {
		
		//String location="Views/Security/login";
		System.out.println("working in Login page");
		return "Views/Security/login";
		
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String postLogin(@ModelAttribute User u, Model model) {
		System.out.println("You entered username" + u.getUsername());
		System.out.println("You entered password" + u.getPassword());
		
		return null;
	}
	
	@RequestMapping(value = "/signup", method = RequestMethod.GET)
	public String getSignup() {
		
		//String location="Views/Security/login";
		System.out.println("working in Signup page");
		return "Views/Security/signup";
		
	}
	
	
	
	@RequestMapping(value = "/signup", method = RequestMethod.POST)
	public String postSignup(Model model) {
		
		return "home";
	}
	
	
}
