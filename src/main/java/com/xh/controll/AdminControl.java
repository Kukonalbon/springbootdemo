package com.xh.controll;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.xh.entiy.Course;

@Controller
@RequestMapping("/admin")
public class AdminControl {

	@RequestMapping(value="/addcourse",method=RequestMethod.POST)
	@ResponseBody
	public String addCourse(Course course){
		System.out.println(course.getName()+"  "+ course.getDescript());
		return "lll";
	}
}
