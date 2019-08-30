package com.ford.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
	
	@RequestMapping("/hello")
	public String redirect() {
		System.out.println("Hello From HelloController(redirecting to viewPage.jsp)....!");
		return "viewpage";
	}
	
	@RequestMapping("/helloagain")
	public String display() {
		System.out.println("Hello From HelloController(redirecting to Final.jsp)....!");
		return "final";
	}
	
}
