package com.tech.springbootkafka.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerService {
    @KafkaListener(topics = "test-topic", groupId = "test-group")
    public void consumeMessage(String message) {
        System.out.println("Message consumed ----> " + message);
    }
}
