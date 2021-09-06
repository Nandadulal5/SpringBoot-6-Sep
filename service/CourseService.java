package com.nandadulal.demo.service;

import java.util.List;

import com.nandadulal.demo.model.Course;

public interface CourseService {
	
	public List<Course> getCourses();

	public Course getCourse(long courseId);

	public Course addCourse(Course course);

	public Course updateCourse(Course course);

	public String deleteCourse(long courseId);

}
