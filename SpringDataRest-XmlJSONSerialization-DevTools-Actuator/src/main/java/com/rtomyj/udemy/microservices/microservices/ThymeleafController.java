package com.rtomyj.udemy.microservices.microservices;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ThymeleafController
{
	@RequestMapping("/thymeleaf")
	public String thymeleaf(final Map model)
	{
		model.put("date", java.time.LocalDate.now());
		return "thymeleaf";
	}
}