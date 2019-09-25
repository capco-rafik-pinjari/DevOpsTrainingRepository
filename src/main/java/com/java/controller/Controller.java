package com.java.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.java.service.WelcomeService;

@RestController
public class Controller {
	
	@Autowired
	WelcomeService welcomeService;
	
	@RequestMapping("/welcome")
	public String welcome() {
		
		return welcomeService.welcome();
	
	}

}
