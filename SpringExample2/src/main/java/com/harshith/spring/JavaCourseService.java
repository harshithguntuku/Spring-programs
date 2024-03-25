package com.harshith.spring;

import org.springframework.stereotype.Component;

@Component
public class JavaCourseService implements CourseService{

	@Override
	public void courseInfo() {
		System.out.println("You selected course Java Full Stack development");
	}

}
