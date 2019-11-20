package com.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class mqTest {
    @Autowired
    private RabbitTemplate rabbitTemplate;

    @Test
    /**
     * 直接模式
     */
    public void send(){
        rabbitTemplate.convertAndSend("itcast","我要红包");
    }

    @Test
    /**
     * 分列模式
     */
    public void sendFanout(){
        rabbitTemplate.convertAndSend("chuanzhi","","分裂模式");
    }

    /**
     * 主题模式
     */
    @Test
    public  void  sendTopic(){
        rabbitTemplate.convertAndSend("topicitcast","good.log","主题模式");
    }
}
