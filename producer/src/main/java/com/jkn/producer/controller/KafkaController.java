package com.jkn.producer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class KafkaController {


    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    @GetMapping("send")
    public ResponseEntity<?> send(){
        kafkaTemplate.send("Topic-1", "Envio de:" + LocalDateTime.now());
        return ResponseEntity.ok().build();
    }
}
