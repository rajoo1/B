package com.demo.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.demo.beans.Topic;

@Service
public class TopicService {
	
	  private List<Topic> topics=new ArrayList<>(Arrays.asList(
			new Topic("spring","Spring framework","Spring freamework description"),
			new Topic("java","core java","core java description"),
			new Topic("oracle","Oracle 10 g","oracle description")			
			));
	  
	  public List<Topic> getTpoics()
		{
			return topics;
		}
	  
	  public Topic getTopic(String id)
	  {
		return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get(); 
	  }

	public void addTopic(Topic topic) {
		topics.add(topic);
		
	}
}
