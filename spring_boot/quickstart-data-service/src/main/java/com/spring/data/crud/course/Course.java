package com.spring.data.crud.course;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.spring.data.crud.topic.Topic;

@Entity
public class Course {

	// Making member variable as primary key
	@Id
	private String id;
	private String name;
	private String des;

	// Many course associated to one topic
	@ManyToOne
	private Topic topic;

	public Topic getTopic() {
		return topic;
	}

	public void setTopic(Topic topic) {
		this.topic = topic;
	}

	public Course(String id, String name, String des, String topicId) {
		// just for convenience create new course obj with a given topic
		super();
		this.id = id;
		this.name = name;
		this.des = des;
		this.topic = new Topic(topicId, "", "");
	}

	public Course() {
		super();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDes() {
		return des;
	}

	public void setDes(String des) {
		this.des = des;
	}
}
