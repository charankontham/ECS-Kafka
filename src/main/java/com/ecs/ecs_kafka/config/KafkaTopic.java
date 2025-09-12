package com.ecs.ecs_kafka.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopic {

    @Bean
    public NewTopic testTopic(){
        return TopicBuilder.name("testKafkaTopic")
                .build();
    }

    @Bean
    public NewTopic orderTrackingUpdatesTopic() {
        return TopicBuilder.name("order-tracking-updates")
                .partitions(1)
                .replicas(1)
                .build();
    }

    @Bean
    public NewTopic orderTrackingCreateTopic() {
        return TopicBuilder.name("order-tracking-create")
                .partitions(1)
                .replicas(1)
                .build();
    }
}
