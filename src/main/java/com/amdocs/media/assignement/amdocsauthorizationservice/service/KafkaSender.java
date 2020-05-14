package com.amdocs.media.assignement.amdocsauthorizationservice.service;

//import javax.annotation.PostConstruct;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.kafka.core.KafkaTemplate;
//import org.springframework.stereotype.Service;
//
//@Service
//public class KafkaSender {
//
//	@Autowired
//	private KafkaTemplate<String, String> kafkaTemplate;
//
//	String kafkaTopic = "amdocs_topic";
//
//	@PostConstruct
//	public void send(String data) {
//
//		kafkaTemplate.send(kafkaTopic, data);
//	}
//}