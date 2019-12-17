//package com.masters.details.plantdetails.Configuration;
//
//import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import org.springframework.context.support.AbstractApplicationContext;
//
//public class MessageProducer {
//
//    public static void main(String[] args)
//    {
//        AbstractApplicationContext context = new AnnotationConfigApplicationContext(
//                ActiveMQ.class);
//
//        MessageSender messageSender = context.getBean(MessageSender.class);
//
//        messageSender.sendMessage("Connection to other services inside the microservices");
//        System.out.println("Message has been sent successfully...");
//
//        ((AbstractApplicationContext) context).close();
//    }
//}
//
////https://programming.vip/docs/use-of-jms-in-springbook.html
