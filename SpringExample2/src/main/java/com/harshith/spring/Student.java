package com.harshith.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Student {
	
	@Autowired
	private EmailService emailService;
	
	@Autowired
	private JavaCourseService javaCourseService;
		

	public void details()
	{
		emailService.message();
		javaCourseService.courseInfo();
	}
	
}
