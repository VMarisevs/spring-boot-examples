package com.apress.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootWebsocketsApplication {

	/*
	 * http://localhost:8080/
	 * 
	 * $ curl localhost:8080/send/message -d "message=Spring Boot Rocks"
	 */
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootWebsocketsApplication.class, args);
	}
}
