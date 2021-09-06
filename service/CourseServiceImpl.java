package com.nandadulal.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nandadulal.demo.dao.CourseDao;
import com.nandadulal.demo.model.Course;

@Service
public class CourseServiceImpl implements CourseService {

	//List<Course> list = new ArrayList<>();
	@Autowired
	private CourseDao courseDao;
	
	
	
	public CourseServiceImpl() {
		
//		list.add(new Course(100,"Java Core"," This contains basic concepts of java"));
//		list.add(new Course(123,"Spring core", "This contains basics of Spring"));
	}


	@Override
	public List<Course> getCourses() {
		//return this.list;
		return courseDao.findAll();
	}


	@Override
	public Course getCourse(long courseId) {
//		Course c = null;
//		for(Course course : list) {
//			if(course.getCourseId() == courseId) {
//				c = course;
//				break;
//			}
//		}
//		return c;
		return courseDao.findById(courseId).get();
	}


	@Override
	public Course addCourse(Course course) {
//		this.list.add(course);
//		return course;
		return courseDao.save(course);
	}


	@Override
	public Course updateCourse(Course course) {
//		for(Course c : list) {
//			if(c.getCourseId()== course.getCourseId()) {
//				list.remove(c);
//				break;
//			}
//		}
//		
//		list.add(course);
//		return course;
		
		return courseDao.save(course);
	}


	@Override
	public String deleteCourse(long courseId) {
//		for(Course c : list) {
//			if(c.getCourseId() == courseId) {
//				list.remove(c);
//				return "deletion successful";
//			}
//		}
//		return "course not found"; 
		Course c =  courseDao.getOne(courseId);
		courseDao.delete(c);
		return "deletion successful";
	}

}
