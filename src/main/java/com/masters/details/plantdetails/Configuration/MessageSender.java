//package com.masters.details.plantdetails.Configuration;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.jms.core.JmsTemplate;
//import org.springframework.jms.core.MessageCreator;
//import org.springframework.stereotype.Component;
//
//import javax.jms.JMSException;
//import javax.jms.Message;
//import javax.jms.ObjectMessage;
//import javax.jms.Session;
//
//@Component
//public class MessageSender {
//
//    @Autowired
//    JmsTemplate jmsTemplate;
//
//    //Sending message to the queue
//    public void sendMessage(final String message)
//    {
//        //https://programming.vip/docs/use-of-jms-in-springbook.html
//        jmsTemplate.send(new MessageCreator()
//        {
//            public Message createMessage(Session session) throws JMSException
//            {
//                ObjectMessage objectMessage = session.createObjectMessage(message);
//                return objectMessage;
//            }
//        });
//    }
//}
