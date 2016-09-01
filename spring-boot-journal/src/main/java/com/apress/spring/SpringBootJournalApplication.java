package com.apress.spring;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.Bean;
import com.apress.spring.domain.Journal;
import com.apress.spring.repository.JournalRepository;

@SpringBootApplication
public class SpringBootJournalApplication {

	/*
	 * mvn spring-boot:run -Dserver.ip=192.168.12.1
	 * 
	 * java -jar target/spring-boot-config-0.0.1-SNAPSHOT.jar --server.ip=192.168.12.1
	 */
	
	private static Logger log = LoggerFactory.getLogger(SpringBootJournalApplication.class);
	
	@Bean
    InitializingBean saveData(JournalRepository repo){
    return () -> {
        repo.save(new Journal("Get to know Spring Boot", "Today I will learn Spring Boot","01/01/2016"));
        repo.save(new Journal("Simple Spring Boot Project","I will do my first Spring Boot Project","01/02/2016"));
        repo.save(new Journal("Spring Boot Reading","Read more about Spring Boot","02/01/2016"));
        repo.save(new Journal("Spring Boot in the Cloud","Spring Boot using Cloud Foundry","03/01/2016"));
      };
   }
	
	@Value("${server.ip}") 
	String serverIp; 

	@Bean
	CommandLineRunner values(){
		return args -> {
			log.info(" > The Server IP is: " +     serverIp );
		};
	} 
	
	
	public static void main(String[] args) {

		new SpringApplicationBuilder(SpringBootJournalApplication.class)
	        .run(args);
	}
	
}
