package com.demo.TopicController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.demo.beans.Topic;
import com.demo.services.TopicService;

@RestController
public class TopicController {
	
	@Autowired
	private TopicService topicService;

	@RequestMapping("/topics")
	public List<Topic> getTpoics()
	{
		return topicService.getTpoics(); 
	}
	
	@RequestMapping("/topics/{id}")
	public Topic getTopice(@PathVariable String id)
	{
		return topicService.getTopic(id);
	}
    
	@RequestMapping(method=RequestMethod.POST,value="/topics")
	public void addTopic(@RequestBody Topic topic){
		System.out.println(topic);
		topicService.addTopic(topic);
	}
}
