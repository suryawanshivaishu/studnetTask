package com.student.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class maincontroller {
	
	@RequestMapping("/index")
	public String index() {
		System.out.println("this is index page");
		return "index";
	}
	
	
}
