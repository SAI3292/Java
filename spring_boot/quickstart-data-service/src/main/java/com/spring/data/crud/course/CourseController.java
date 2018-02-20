package com.spring.data.crud.course;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.spring.data.crud.topic.Topic;

@RestController
public class CourseController {

	// We have to inject try to see dependency
	@Autowired
	private CourseService courseService;

	@RequestMapping("/topics/{id}/courses")
	public List<Course> getAllCourses(@PathVariable("id") String id) {
		// Get all courses that belong to particular topic id
		return courseService.getAllCourses(id);
	}

	/**
	 * {} special in sending value to method and PathVariable is used for mapping if
	 * same no need to use ("id")
	 */
	@RequestMapping("/topics/{topicId}/courses/{id}")
	// Ignoring topic id becoz only want course on id
	public Course getCourse(@PathVariable("topicId") String topicId, @PathVariable("id") String id) {
		return courseService.getCourse(id);
	}

	/**
	 * ways of specifying Post and value i.e URL
	 * 
	 * @RequestBody : tells mvc that the request payload contains a json
	 *              representation of Topic, take that and convert into Topic
	 *              instance and give
	 */
	@RequestMapping(method = RequestMethod.POST, value = "/topics/{topicId}/courses")
	public void addCourse(@RequestBody Course course, @PathVariable("topicId") String topicId) {
		// course should contain some topic information
		course.setTopic(new Topic(topicId, "", ""));
		courseService.addCourse(course);
	}

	@RequestMapping(method = RequestMethod.PUT, value = "/topics/{topicId}/courses{id}")
	public void updateCourse(@RequestBody Course course, @PathVariable String topicId) {
		course.setTopic(new Topic(topicId, "", ""));
		courseService.updateCourse(course);
	}

	@RequestMapping(method = RequestMethod.DELETE, value = "/topics/{topicId}/courses{id}")
	// Ignore the topic i dont care just delete
	public void deleteCourse(@PathVariable String id) {
		courseService.deleteCourse(id);
	}
}
