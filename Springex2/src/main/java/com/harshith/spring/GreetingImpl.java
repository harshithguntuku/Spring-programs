package com.harshith.spring;

public class GreetingImpl implements Greeting {

	@Override
	public void greet() {
		System.out.println("Welcomee to Spring class");
	}
	public GreetingImpl()
	{
		System.out.println("GreetingImpl Constructor object created");
	}

}
