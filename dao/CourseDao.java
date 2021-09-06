package com.nandadulal.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nandadulal.demo.model.Course;

public interface CourseDao extends JpaRepository<Course, Long>{

}
