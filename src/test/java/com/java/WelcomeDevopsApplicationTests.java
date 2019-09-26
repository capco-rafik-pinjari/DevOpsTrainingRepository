package com.java;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.java.service.WelcomeService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class WelcomeDevopsApplicationTests {
	
	@Autowired
	WelcomeService welcomeservice;

	@Test
	public void contextLoads() {
		assertEquals("success", welcomeservice.welcome());
	}

}
