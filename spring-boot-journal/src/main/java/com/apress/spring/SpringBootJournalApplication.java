package com.apress.spring;

import java.io.PrintStream;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;

import com.apress.spring.domain.Journal;
import com.apress.spring.repository.JournalRepository;

@SpringBootApplication
public class SpringBootJournalApplication {

	@Bean
    InitializingBean saveData(JournalRepository repo){
    return () -> {
        repo.save(new Journal("Get to know Spring Boot", "Today I will learn Spring Boot","01/01/2016"));
        repo.save(new Journal("Simple Spring Boot Project","I will do my first Spring Boot Project","01/02/2016"));
        repo.save(new Journal("Spring Boot Reading","Read more about Spring Boot","02/01/2016"));
        repo.save(new Journal("Spring Boot in the Cloud","Spring Boot using Cloud Foundry","03/01/2016"));
      };
   }
	
	
	public static void main(String[] args) {
		// SpringApplication.run(SpringBootJournalApplication.class, args);
		
		SpringApplication app = new SpringApplication(SpringBootJournalApplication.class);
		
		// http://patorjk.com/
//		app.setBanner(new Banner() {
//			
//			@Override
//			public void printBanner(Environment environment, Class<?> sourceClass, PrintStream out) {
//				// TODO Auto-generated method stub
//				out.println("   ____  ____             _               ____              _    ____  ");
//				out.println("  / / / / ___| _ __  _ __(_)_ __   __ _  | __ )  ___   ___ | |_  \\ \\ \\ ");
//				out.println(" / / /  \\___ \\| '_ \\| '__| | '_ \\ / _` | |  _ \\ / _ \\ / _ \\| __|  \\ \\ \\");
//				out.println(" \\ \\ \\   ___) | |_) | |  | | | | | (_| | | |_) | (_) | (_) | |_   / / /");
//				out.println("  \\_\\_\\ |____/| .__/|_|  |_|_| |_|\\__, | |____/ \\___/ \\___/ \\__| /_/_/ ");
//				out.println("              |_|                 |___/                                ");
//				out.println("");
//		          
//			}
//		});
		
		
		
		app.run(args);
	}
}
