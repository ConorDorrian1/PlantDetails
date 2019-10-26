package com.masters.details.plantdetails.Contoller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.jms.Queue;

//@RestController contains @Controller and @ResponseBody
@RestController //Spring RestController annotation is used to create RESTful web services.
@RequestMapping("/api")
public class MessageController {

    //Injecting the bean into the class along with java messaging service(JMS)
    @Autowired //Allows the injection of object dependency
    private Queue queue;

    //JmsTemplate is a helper class that simplifies receiving and sending of messages through JMS
    @Autowired
    //This provides the class a communication with jms
    private JmsTemplate jmsTemplate; //gets rid of boilerplate code

    //API endpoint which will accept string as a parameter and puts it on the queue.
    @GetMapping("message/{message}") //maps HTTP GET requests onto specific handler methods
    public ResponseEntity<String> publish(@PathVariable("message") final String message){
        jmsTemplate.convertAndSend(queue, message);
        return new ResponseEntity(message, HttpStatus.OK);
    }

}
