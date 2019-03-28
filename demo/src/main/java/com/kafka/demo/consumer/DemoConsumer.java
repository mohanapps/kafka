package com.kafka.demo.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class DemoConsumer {
	
	@KafkaListener(topics={"test"})
	void processMessage(String content){
		System.out.println(content);
	}

}
