package com.example1.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class testController {
	
	@GetMapping("/hello")
	public String hello()
	{
		return "Hello World!";
	}
}