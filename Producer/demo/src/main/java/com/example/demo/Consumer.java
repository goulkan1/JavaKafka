package com.example.demo;

import java.io.IOException;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class Consumer {

    private final Logger logger = LoggerFactory.getLogger(Producer.class);

    // @KafkaListener(topics = "test_topic", groupId = "group_id")
    // public void consume(String message) throws IOException {
    // logger.info(String.format("#### -> Consumed message -> %s", message));
    // }

    // @KafkaListener(topics = "test_topic")
    // void listener(String data) {
    // logger.info(data);
    // }

    // @KafkaListener(topics = "test_topic", groupId = "group_id")
    // void commonListenerForMultipleTopics(String message) {
    // logger.info("MultipleTopicListener - {}", message);
    // }
}