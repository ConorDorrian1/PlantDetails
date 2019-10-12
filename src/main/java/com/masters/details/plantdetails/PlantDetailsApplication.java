package com.masters.details.plantdetails;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
						/* @SpringBootApplication Annotation consists of
							@Component - which tells the compiler that the following class is a component and needs compiled
							@ComponentScan - which tells the compiler which packages to use
							@EnableAutoConfiguration - which enables autoconfiguration to import modules for the Spring Boot to run
							These annotations ared used to start the Spring Boot Application to run on a server.
	 					*/
//@ComponentScan(basePackages={"com.masters.details.plantdetails.Contoller"}) // So so the controller can access spring boot
@EnableEurekaClient
public class PlantDetailsApplication {

	public static void main(String[] args) {
		SpringApplication.run(PlantDetailsApplication.class, args);
	}

}
