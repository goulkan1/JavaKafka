package com.example.demo;

import java.io.IOException;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class Consumer {

    @KafkaListener(topics = "test_topic", groupId = "group_id")
    public void consume(ConsumerRecord<String, String> payload) {
        System.out.println("Tópico: {}" + "test_topic");
        System.out.println("key: {}" + payload.key());
        System.out.println("Headers: {}" + payload.headers());
        System.out.println("Partion: {}" + payload.partition());
        System.out.println("Order: {}" + payload.value());
    }

}