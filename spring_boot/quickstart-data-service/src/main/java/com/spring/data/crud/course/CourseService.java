package com.spring.data.crud.course;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//These is a business service. Register on start of App 

@Service
public class CourseService {

	// Injecting courses repository having crud service
	@Autowired
	private CourseRepository coursesrepository;

	/**
	 * Get only topic related courses, find all on basis of topic
	 */
	public List<Course> getAllCourses(String topicId) {
		List<Course> courses = new ArrayList<Course>();
		coursesrepository.findByTopicId(topicId).forEach(courses::add);
		return courses;
	}

	public Course getCourse(String Id) {
		return coursesrepository.findOne(Id);
	}

	public void addCourse(Course course) {
		coursesrepository.save(course);
	}

	public void updateCourse(Course course) {
		coursesrepository.save(course);
		// repository knows already have row with id so it will update awesome
	}

	public void deleteCourse(String id) {
		coursesrepository.delete(id);
	}
}
