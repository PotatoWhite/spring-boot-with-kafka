package me.potato.kafka.springbootwithkafka.controllers;

import lombok.extern.slf4j.Slf4j;
import me.potato.kafka.springbootwithkafka.models.services.Producer;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping(value="/kafka")
public class KafkaController {
    private final Producer producer;

    public KafkaController(Producer producer) {
        this.producer = producer;
    }

    @PostMapping(value = "publish")
    public void sendMessageToKafkaTopic(@RequestParam("message") String message){
        producer.sendMessage(message);
    }
}
