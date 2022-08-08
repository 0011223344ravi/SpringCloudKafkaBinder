package com.example.kafkabinder_consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.MessageChannel;


@SpringBootApplication
public class KafkaBinderConsumerApplication {
	private Logger logger = LoggerFactory.getLogger(KafkaBinderConsumerApplication.class);

	@StreamListener("input")
	public void consumeMessage(Book book) {
		logger.info("Consume payload : " + book);
	}



	public static void main(String[] args) {
		SpringApplication.run(KafkaBinderConsumerApplication.class, args);
	}

}
