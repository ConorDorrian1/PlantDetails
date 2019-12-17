package com.masters.details.plantdetails.Configuration;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.masters.details.plantdetails.Configuration.AppConfig;

public class MessageProducer {

    public static void main(String[] args)
    {
        AbstractApplicationContext context = new AnnotationConfigApplicationContext(
                AppConfig.class);

        MessageSender messageSender = context.getBean(MessageSender.class);

        messageSender.sendMessage("Hi Peter, How are you?");
        System.out.println("Message has been sent successfully...");

        ((AbstractApplicationContext) context).close();
    }
}
