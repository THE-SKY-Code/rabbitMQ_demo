package com.test;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "itheima")
public class Customer2 {
    @RabbitHandler
    public void  show(String mes){
        System.out.println("feature_test");
        System.out.println("itheima"+mes);
        System.out.println("hello1");
        System.out.println("world1");
    }
}
