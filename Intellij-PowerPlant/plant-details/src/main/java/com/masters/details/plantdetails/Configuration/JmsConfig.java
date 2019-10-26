package com.masters.details.plantdetails.Configuration;

import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.jms.Queue;

@Configuration
public class JmsConfig {

    @Bean  //Declaring a bean queue
    public Queue queue(){
        return new ActiveMQQueue("PlantDetails-queue"); //nameing the queue, This could also go in applicaion.properties
    }
}
