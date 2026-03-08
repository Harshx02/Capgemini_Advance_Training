package com.capg.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CapgTopicsController {
	
	@Autowired
	CapgTopicsService topicsService;
	
	@RequestMapping("/myController")
	public String display() {
		return "My Controller";
	}
	
	@RequestMapping("/capgtopics")
	public List<CapgTopics> getAllTopics() {
		return topicsService.getAllMyTopics();
	}
	
	//get all topics
	@RequestMapping("/capgtopics/{id}")
	public CapgTopics getTopics (@PathVariable String id) {
		return topicsService.getTopic(id);
	}
	
	
	@RequestMapping(method=RequestMethod.POST, value = "/capgtopics")
	public void addTopic(@RequestBody CapgTopics topic) {
		topicsService.addTopic(topic);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value = "/topics{id}")
	public void deleteTopic(@RequestBody CapgTopics topic,String id) {
		topicsService.deleteTopic(id);
	}
	
}