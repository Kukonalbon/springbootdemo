package com.xh.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xh.entiy.Course;
import com.xh.repository.CourseRepository;

@Component
public class CourseService {
	
	@Autowired
	private CourseRepository courseRepository;
	
	public List<Course> getCourses(){
		return (List<Course>) courseRepository.findAll();
	}
}
