package com.project.springkafka.controller;

import com.project.springkafka.kafka.KafkaProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class kafkacontroller {

    @Autowired
    private KafkaProducer kafkaProducer;

    @GetMapping("/updateLocation")
    void sendMessagesToKafka() {
        //iterating to create 2 lakh messages at once
        for(int i=1;i<20000;i++){
            String locationCoordinates = Math.random()+" , "+Math.random();
            kafkaProducer.sendMessage(locationCoordinates);
        }
    }


}
