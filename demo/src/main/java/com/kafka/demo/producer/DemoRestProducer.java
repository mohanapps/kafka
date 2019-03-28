package com.kafka.demo.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoRestProducer {
	
	@Autowired
	KafkaTemplate<String, String> kafkaTemplate;
	
	@RequestMapping(value="/kafka/sendMessage/{id}",method={RequestMethod.GET})
	public void restMessageGateWay(@PathVariable("id") String id){
		this.kafkaTemplate.send("test", id);
	}

}
