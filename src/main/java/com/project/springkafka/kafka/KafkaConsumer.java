package com.project.springkafka.kafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import static com.project.springkafka.constants.AppConstants.TOPIC_NAME;

@Service
public class KafkaConsumer {

    int i;

    @KafkaListener(topics = {TOPIC_NAME}, groupId = "consumer-group-1")
    public void readMessage(String message) {
        System.out.println(message);
        System.out.println("----------------------------------");
        System.out.println(i++);
    }
}
