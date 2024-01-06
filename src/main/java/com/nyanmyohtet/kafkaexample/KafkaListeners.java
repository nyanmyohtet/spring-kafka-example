package com.nyanmyohtet.kafkaexample;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {

    @KafkaListener(topics = "nyan", groupId = "groupId")
    void listener(String data) {
        System.out.println("Listener received message(topics = \"nyan\", groupId = \"groupId\") : " + data);
    }

}
