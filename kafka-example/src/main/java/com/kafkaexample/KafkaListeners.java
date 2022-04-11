package com.kafkaexample;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {

    @KafkaListener(topics = "deepakTopic1" , groupId = "deepakTopic1GroupId")
    void listner(String data){

        System.out.println("Listener Received data=> "+data+":-)");
    }
}
