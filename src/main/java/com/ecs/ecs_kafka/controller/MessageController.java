package com.ecs.ecs_kafka.controller;

import com.ecs.ecs_kafka.kafka.KafkaProducerService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/kafka")
public class MessageController {
    private final KafkaProducerService testKafkaProducer;

    public MessageController(KafkaProducerService testKafkaProducer) {
        this.testKafkaProducer = testKafkaProducer;
    }

    @GetMapping("/publish")
    public ResponseEntity<String> publish(@RequestParam String message) {
        testKafkaProducer.sendMessage("testKafkaTopic", message);
        return ResponseEntity.ok("Message published");
    }
}
