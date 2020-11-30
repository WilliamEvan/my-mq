package com.gupaoedu.basic.consumer;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @Author: zxwang
 * @Description: 学习
 */
@Component
@RabbitListener(queues = "GP_BASIC_THIRD_QUEUE")
public class ThirdConsumer {

    @RabbitHandler
    public void process(String msg){
        System.out.println(" third queue received msg : " + msg);
    }
}
