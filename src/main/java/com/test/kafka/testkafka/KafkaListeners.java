package com.test.kafka.testkafka;


import org.springframework.stereotype.Component;
import org.springframework.kafka.annotation.KafkaListener;

@Component
public class KafkaListeners {

    @KafkaListener(
            topics="test-me-topics1",
            groupId = "groupId"
    )
    void listener(String data){
        System.out.println("Listener received : "+data +" ");
    }

}
