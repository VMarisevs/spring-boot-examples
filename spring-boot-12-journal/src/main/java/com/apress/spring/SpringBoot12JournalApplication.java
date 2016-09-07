package com.apress.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;     
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;

@SpringBootApplication
public class SpringBoot12JournalApplication extends SpringBootServletInitializer {

	
	 protected SpringApplicationBuilder configure(SpringApplicationBuilder  application) { 
		 return application.sources(SpringBoot12JournalApplication.class); 
	 }
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBoot12JournalApplication.class, args);
	}
}
