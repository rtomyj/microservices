package com.rtomyj.udemy.microservices.microservices.Lab1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BaseController {

	@GetMapping("/")
	public String get()
	{
		return "hello";
	}

}