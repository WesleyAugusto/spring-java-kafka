package com.data.springjavakafkalistener.kafka;

import com.data.springjavakafkalistener.model.Message;
import com.google.gson.Gson;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Listener {

    @Autowired
    private Gson gson;

    @KafkaListener(topics = "topics")
    public void consumer(ConsumerRecord<String, String> message){
        var response = gson.fromJson(message.value(), Message.class);
        System.out.println("message = " + response);
    }
}
