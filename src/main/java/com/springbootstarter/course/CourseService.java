package com.springbootstarter.course;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {

	@Autowired
	CourseRepository courseRepository;

	public List<Course> getAllCourses(int topicId) {
		return courseRepository.findByTopicId(topicId);
	}

	public Course getCourse(int id) {
		return courseRepository.findOne(id);
	}

	public void addCourse(Course topic) {
		courseRepository.save(topic);
	}

	public void updateCourse(int id, Course topic) {
		courseRepository.save(topic);
	}

	public void deleteCourse(int id) {
		courseRepository.delete(id);
	}
}
