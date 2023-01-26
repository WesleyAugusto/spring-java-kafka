package com.data.springjavakafkaclient.kafka;


import com.data.springjavakafkaclient.model.Message;
import org.springframework.context.annotation.Bean;


public interface KafkaClient {

    public void sendMessage (Message message);
}
