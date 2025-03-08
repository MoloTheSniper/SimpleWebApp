package com.Moloko.simpleWebAppp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController 
{
	@RequestMapping("/")
	public String greet()
	{
		return "Welcome to Moloko!!!";
	}
	
	@RequestMapping("/about")
	public String about()
	{
		return "We dont teach, we educate!!!";
	}
}
