//package com.masters.details.plantdetails.Configuration;
//
//import org.apache.activemq.ActiveMQConnectionFactory;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.jms.core.JmsTemplate;
//import org.springframework.jms.support.converter.MessageConverter;
//import org.springframework.jms.support.converter.SimpleMessageConverter;
//
//import javax.jms.ConnectionFactory;
//import java.util.Arrays;
//
//@Configuration  //declares one or more @Bean methods and may be processed by the spring class
//public class MessagingConfiguration {
//
//    private static final String DEFAULT_BROKER_URL= "tcp://localhost:6161";
//    private static final String MESSAGE_QUEUE = "message_queue";
//
//
//    @Bean
//    //Creating a connection factory object
//    ////ConnectionFactory is used to create a connection with a JMS provider
//    public ConnectionFactory connectionFactory(){
//        ActiveMQConnectionFactory connectionFactory = new ActiveMQConnectionFactory();
//        connectionFactory.setBrokerURL(DEFAULT_BROKER_URL);
//        connectionFactory.setTrustedPackages(Arrays.asList("com.masters.details.plantdetails"));
//        return connectionFactory();
//    }
//
//    // Sending messages
//    @Bean
//    public JmsTemplate jmsTemplate(){
//        JmsTemplate template = new JmsTemplate();
//        template.setConnectionFactory(connectionFactory());
//        template.setDefaultDestinationName(MESSAGE_QUEUE);
//        return template;
//    }
//
//    @Bean
//    MessageConverter converter(){
//        return new SimpleMessageConverter();
//    }
//}
