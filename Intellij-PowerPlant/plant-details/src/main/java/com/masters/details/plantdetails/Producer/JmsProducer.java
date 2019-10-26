package com.masters.details.plantdetails.Producer;

import com.masters.details.plantdetails.Models.PlantDetails;
import com.netflix.discovery.converters.Auto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

@Component
public class JmsProducer {

    @Autowired
    JmsTemplate jmsTemplate;

    @Value("${gkz.activemq.queue}")
    String queue;

    public void send(PlantDetails plantDetail){
        jmsTemplate.convertAndSend(queue, "communication works!");
    }
}
