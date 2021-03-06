package com.apress.spring;

import org.slf4j.Logger; 
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication; 
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;     
import org.springframework.web.bind.annotation.RestController;

import com.apress.spring.repository.PersonRepository;

@RestController 
@SpringBootApplication
public class SpringBootWebActuatorApplication {

	/*
	 * http://localhost:8080/actuator
	 * http://localhost:8080/autoconfig
	 * http://localhost:8080/beans
	 * http://localhost:8080/configprops
	 * 
	 */
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootWebActuatorApplication.class, args);
	}
	
	@RequestMapping("/")
    public String index(){
		return "Spring Boot Actuator";
    }
	
	private static final Logger log = LoggerFactory.getLogger(SpringBootWebActuatorApplication.class);

	     @Bean
	     CommandLineRunner findAll(PersonRepository repo){
	    	 return args ->{
	                    log.info("> Persons in Database: ");
	                    repo.findAll().forEach(person -> log.info(person.toString()));
	           };
	     }
}
