package com.jkn.consumer1.listener;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class ConsumerListener {

    @KafkaListener(topics = "Topic-1", groupId = "group-1")
    public void listen(String message){
        log.info("Tread: {}", + Thread.currentThread().getId());
        log.info("Received: {}", message);
    }
}
