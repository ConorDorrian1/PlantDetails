package com.masters.details.plantdetails;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication   /* @SpringBootApplication Annotation consists of
							@Component - which tells the compiler that the following class is a component and needs compiled
							@ComponentScan - which tells the compiler which packages to use
							@EnableAutoConfiguration - which enables autoconfiguration to import modules for the Spring Boot to run
							These annotations ared used to start the Spring Boot Application to run on a server.
	 					*/
public class PlantDetailsApplication {

	public static void main(String[] args) {
		SpringApplication.run(PlantDetailsApplication.class, args);
	}

}
