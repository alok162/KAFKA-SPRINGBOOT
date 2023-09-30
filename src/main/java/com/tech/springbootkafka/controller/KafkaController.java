package com.tech.springbootkafka.controller;

import com.tech.springbootkafka.service.KafkaProducerService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KafkaController {
    private final KafkaProducerService kafkaProducerService;

    public KafkaController(KafkaProducerService kafkaProducerService) {
        this.kafkaProducerService = kafkaProducerService;
    }

    @PostMapping
    public void message() {
        System.out.println("controller called ----");
        kafkaProducerService.sendMessage("test-topic", "my first kafka message");
    }
}
