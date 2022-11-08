package com.kafka.h2db.springboot.KafkaConsumer.controller;

import com.kafka.h2db.springboot.KafkaConsumer.consumer.TopicConsumer;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/kafka/consumer")
@RequiredArgsConstructor
public class ConsumerController {

    private final TopicConsumer consumer;

    @GetMapping("/consume")
    public String consume(){
        return consumer.getLoadedConsume();
    }

}
