package com.spring.data.crud.course;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface CourseRepository extends CrudRepository<Course, String> {
	/**
	 * 
	 * @param topicIs
	 * @return Not need to implement the method just declare the method with
	 *         findByProperty name format and spring data jpa will implement the
	 *         method Method structure is important
	 */

	// public List<Course> findByTopic(String topicId);
	// would be worked if the topic property is string in course Topic is obj

	public List<Course> findByTopicId(String topicId);

	// looking for topic on course and id property on topic

	public List<Course> findByName(String name);

	public List<Course> findByDes(String des);
}
