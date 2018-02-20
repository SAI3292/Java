package com.spring.data.crud.topic;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Topic {

	// Making member variable as primary key
	@Id
	private String id;
	private String name;
	private String des;

	public Topic(String id, String name, String des) {
		super();
		this.id = id;
		this.name = name;
		this.des = des;
	}

	public Topic() {
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
