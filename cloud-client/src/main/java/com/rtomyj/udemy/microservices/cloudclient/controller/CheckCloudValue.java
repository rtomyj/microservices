package com.rtomyj.udemy.microservices.cloudclient.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CheckCloudValue
{
	@Autowired
	private Environment environment;

	@Value("${config.status}")
	private String status;

	@GetMapping("/{propName}")
	public ResponseEntity<String> getProp()
	{
		System.out.println(environment.toString());
		return ResponseEntity.ok(status);
	}
}