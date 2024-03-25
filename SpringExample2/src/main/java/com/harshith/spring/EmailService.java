package com.harshith.spring;

import org.springframework.stereotype.Component;

@Component
public class EmailService implements MessageService{

	@Override
	public void message() {
		System.out.println("Heloo welcome to message Service");
	}

}
