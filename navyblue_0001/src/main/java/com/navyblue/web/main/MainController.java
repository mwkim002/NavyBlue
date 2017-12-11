package com.navyblue.web.main;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

	@RequestMapping("/")
	public String selectDefaultPage() {
		
		System.out.println("hello world");
		
		return "hello world" ; 
	}
}
