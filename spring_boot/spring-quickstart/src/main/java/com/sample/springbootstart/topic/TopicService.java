package com.sample.springbootstart.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

//These is a business service. Register on start of App 

@Service
public class TopicService {

	List<Topic> topics = new ArrayList<>(Arrays.asList(new Topic("java", "java code", "do it"),
			new Topic("spring", "spring", "framework"), new Topic("javascript", "javascript", "javascript")));

	public List<Topic> getAllTopics() {
		return topics;
	}

	public Topic getTopic(String Id) {
		// Lambda expression using stream
		return topics.stream().filter(t -> t.getId().equals(Id)).findFirst().get();
	}

	public void addTopic(Topic topic) {
		topics.add(topic);
	}

	public void updateTopic(String id, Topic topic) {
		// topics.remove(topics.stream().filter(t ->
		// t.getId().equals(id)).findFirst().get());
		// topics.add(topic);
		for (int i = 0; i < topics.size(); i++) {
			Topic t = topics.get(i);
			if (t.getId().equals(id)) {
				topics.set(i, topic);
				return;
			}
		}
	}

	public void deleteTopic(String id) {
		topics.removeIf(t -> t.getId().equals(id));
		// remove takes a bool
	}
}
