package com.rtomyj.udemy.microservices.cloudclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CheckCloudValue
{
	@Value("${config.value}")
	private String value;


	@GetMapping("/{propName}")
	public ResponseEntity<String> getProp()
	{
		return ResponseEntity.ok(value);
	}
}