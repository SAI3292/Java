package com.sample.springbootstart.topic;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {

	// We have to inject try to see dependency
	@Autowired
	private TopicService topicService;

	@RequestMapping("/topics")
	public List<Topic> getAllTopics() {
		// return "All topics";
		return topicService.getAllTopics();
	}

	/**
	 * {} special in sending value to method and PathVariable is used for mapping if
	 * same no need to use ("id")
	 */
	@RequestMapping("/topics/{id}")
	public Topic getTopic(@PathVariable("id") String Id) {
		return topicService.getTopic(Id);
	}

	/**
	 * ways of specifying Post and value i.e URL
	 * 
	 * @RequestBody : tells mvc that the request payload contains a json
	 *              representation of Topic, take that and convert into Topic
	 *              instance and give
	 */
	@RequestMapping(method = RequestMethod.POST, value = "/topics")
	public void addTopic(@RequestBody Topic topic) {
		topicService.addTopic(topic);
	}

	@RequestMapping(method = RequestMethod.PUT, value = "/topics/{Id}")
	public void updateTopic(@RequestBody Topic topic, @PathVariable String Id) {
		topicService.updateTopic(Id, topic);
	}

	@RequestMapping(method = RequestMethod.DELETE, value = "/topics/{id}")
	public void deleteTopic(@PathVariable String id) {
		topicService.deleteTopic(id);
	}
}
