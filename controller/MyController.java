package com.nandadulal.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nandadulal.demo.model.Course;
import com.nandadulal.demo.service.CourseService;

@RestController
public class MyController{
	
	@Autowired
	private CourseService courseServiceImpl;
	
	@GetMapping("/courses")
	public List<Course> getCourses(){
		return this.courseServiceImpl.getCourses();
	}
	
	@GetMapping("/course/{courseId}")
	public Course getCourse(@PathVariable long courseId) {
		return this.courseServiceImpl.getCourse(courseId);
	}
	
	@PostMapping("/course")
	public Course addCourse(@RequestBody Course course) {
		return this.courseServiceImpl.addCourse(course);
	}
	
	@PutMapping("/course")
	public Course updateCourse(@RequestBody Course course) {
		return this.courseServiceImpl.updateCourse(course);
	}
	
	@DeleteMapping("/course/{courseId}")
	public String deletedCourse(@PathVariable long courseId) {
		return this.courseServiceImpl.deleteCourse(courseId);
	}
	
}