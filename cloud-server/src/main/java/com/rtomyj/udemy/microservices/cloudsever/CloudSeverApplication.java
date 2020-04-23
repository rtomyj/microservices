package com.rtomyj.udemy.microservices.cloudsever;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class CloudSeverApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudSeverApplication.class, args);
	}

}
