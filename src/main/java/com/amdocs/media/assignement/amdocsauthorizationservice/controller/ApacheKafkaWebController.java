package com.amdocs.media.assignement.amdocsauthorizationservice.controller;

//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.amdocs.media.assignement.amdocsauthorizationservice.service.KafkaSender;
//
//@RestController
//@RequestMapping(value = "/post-kafka/")
//public class ApacheKafkaWebController {
//
//	@Autowired
//	KafkaSender kafkaSender;
//
//	@PostMapping(value = "/post")
//	public String producer(@RequestParam("message") String message) {
//		kafkaSender.send(message);
//
//		return "Message sent to the Kafka Topic Amdocs_topic Successfully";
//	}
//
//}
