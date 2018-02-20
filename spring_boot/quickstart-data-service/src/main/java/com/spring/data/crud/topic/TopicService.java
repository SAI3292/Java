package com.spring.data.crud.topic;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//These is a business service. Register on start of App 

@Service
public class TopicService {

	// Injecting topic repository having crud service
	@Autowired
	private TopicRepository topicrepository;

	public List<Topic> getAllTopics() {
		// Using method reference
		List<Topic> topics = new ArrayList<Topic>();
		topicrepository.findAll().forEach(topics::add);
		return topics;
	}

	public Topic getTopic(String Id) {
		return topicrepository.findOne(Id);
	}

	public void addTopic(Topic topic) {
		topicrepository.save(topic);
	}

	public void updateTopic(String id, Topic topic) {
		topicrepository.save(topic);
		// repository knows already have row with id so it will update awesome
	}

	public void deleteTopic(String id) {
		topicrepository.delete(id);
	}
}
