package com.ecs.ecs_kafka.kafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaConsumerService {
    @KafkaListener(topics = {"order-tracking-updates", "order-tracking-create"}, groupId = "ecsGroup")
    public void consume(String message) {
        System.out.println("Message Received : " + message);
    }

//    @KafkaListener(topics = "order-tracking-create", groupId = "ecsGroup")
//    public void consume(String message) {
//        System.out.println("Message Received : " + message);
//    }
}
