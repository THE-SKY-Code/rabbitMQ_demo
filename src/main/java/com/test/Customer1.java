package com.test;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.amqp.rabbit.annotation.RabbitListeners;
import org.springframework.stereotype.Component;
@Component
@RabbitListener(queues = "itcast")
public class Customer1 {
    @RabbitHandler
    public void  show(String mes){
        System.out.println("itcast"+mes);
    }
}
