package com.xh.controll;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.xh.entiy.Course;
import com.xh.service.CourseService;

@Controller
@RequestMapping("/admin")
public class AdminControl {
	
	@Autowired
	private CourseService courseService;
	
	@RequestMapping(value="/addcourse",method=RequestMethod.POST)
	@ResponseBody
	public String addCourse(Course course){
		System.out.println(course.getName()+"  "+ course.getDescript());
		return "lll";
	}
	
	@RequestMapping(value="/getcourse",method=RequestMethod.GET)
	@ResponseBody
	public List<Course> getCourse(){
		System.out.println("**");
		List<Course> courses=courseService.getCourses();
		for (Course c : courses) {
			System.out.println(c.getId()+"  "+c.getName()+"  "+c.getDescript()+"  "+c.getCreate_time());
		}
		return courses;
	}
}
