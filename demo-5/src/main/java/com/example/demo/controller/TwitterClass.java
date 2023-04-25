package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TwitterClass {
	@GetMapping("/Login")
	public String Loginpage()
	{
		return ("Login Successful");
	}
	@GetMapping("/Landingpage/{username}")
	public String Landingpage(@PathVariable("username") String username)
	{
		return ("Landing page of user "+username);
	}
}