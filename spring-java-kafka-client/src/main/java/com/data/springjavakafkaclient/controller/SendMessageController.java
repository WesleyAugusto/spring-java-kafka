package com.data.springjavakafkaclient.controller;

import com.data.springjavakafkaclient.kafka.KafkaClient;
import com.data.springjavakafkaclient.model.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/kafka")
public class SendMessageController {
    @Autowired
    private KafkaClient kafkaClient;

    @PostMapping
    public void sendMessage(@RequestBody Message message) {

        kafkaClient.sendMessage(message);
    }

}
