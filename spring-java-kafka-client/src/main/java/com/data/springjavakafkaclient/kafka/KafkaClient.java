package com.data.springjavakafkaclient.kafka;


import com.data.springjavakafkaclient.model.Message;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaClient {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    @Autowired
    private Gson gson;

    public void sendMessage(Message message) {
        kafkaTemplate.send("topics", gson.toJson(message));
    }
}
