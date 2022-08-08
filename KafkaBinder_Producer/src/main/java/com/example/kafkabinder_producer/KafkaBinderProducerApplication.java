package com.example.kafkabinder_producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.cloud.stream.messaging.Source;

@SpringBootApplication
@EnableBinding(Source.class)
@RestController
public class KafkaBinderProducerApplication {
	@Autowired
	private MessageChannel output;

	@PostMapping("/publish")
	public Book publishEvent(@RequestBody Book book) {
		output.send(MessageBuilder.withPayload(book).build());
		return book;
	}



	public static void main(String[] args) {
		SpringApplication.run(KafkaBinderProducerApplication.class, args);
	}

}
