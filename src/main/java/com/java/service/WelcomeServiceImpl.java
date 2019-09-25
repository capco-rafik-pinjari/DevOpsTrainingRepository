package com.java.service;

import org.springframework.stereotype.Service;

@Service
public class WelcomeServiceImpl implements WelcomeService{

	@Override
	public String welcome() {
		return "success";
	}

}
