package com.harshith.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {
	@Bean
	public Person person()
	{
		Person person = new Person();
		person.setName("Harshith");
		person.setMobile(97856453);
		person.setEmail("hari@gmail.com");
		return person;
		
	}

}
