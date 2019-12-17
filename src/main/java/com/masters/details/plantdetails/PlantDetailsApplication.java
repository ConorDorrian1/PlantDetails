package com.masters.details.plantdetails;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.Bean;
import org.springframework.jms.annotation.EnableJms;
import org.springframework.jms.core.JmsTemplate;


@SpringBootApplication
						/* @SpringBootApplication Annotation consists of
							@Component - which tells the compiler that the following class is a component and needs compiled
							@ComponentScan - which tells the compiler which packages to use
							@EnableAutoConfiguration - which enables autoconfiguration to import modules for the Spring Boot to run
							These annotations ared used to start the Spring Boot Application to run on a server.
	 					*/
//@ComponentScan(basePackages={"com.masters.details.plantdetails.Contoller"}) // So so the controller can access spring boot
@EnableEurekaClient
@EnableCircuitBreaker
@EnableHystrix
@EnableJms
public class PlantDetailsApplication {

	public static void main(String[] args) {
		SpringApplication.run(PlantDetailsApplication.class, args);
	}
}
