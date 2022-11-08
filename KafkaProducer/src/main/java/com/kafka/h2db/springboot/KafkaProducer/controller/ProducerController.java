package com.kafka.h2db.springboot.KafkaProducer.controller;

import com.kafka.h2db.springboot.KafkaProducer.Model.User;
import com.kafka.h2db.springboot.KafkaProducer.producer.TopicsProducer;
import lombok.RequiredArgsConstructor;


import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/producer")
@RequiredArgsConstructor
public class ProducerController {
    //@Autowired
    //private TopicsProducer topicsProducer;
    private final TopicsProducer topicProducer;

    @GetMapping("/send")
    public void send(){

        topicProducer.send("Some Message...");
    }

    @GetMapping("/send/{name}")
    public void send(@PathVariable("name") String name){
        topicProducer.sendwithname("Hello "+name);
    }

    @PostMapping("/send")
    public User send(@RequestBody User user){
        topicProducer.send(user.toString());
        return user;

    }


}
