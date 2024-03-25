package com.harshith.spring;

public class GreetingImpl implements Greeting {

	@Override
	public void greet() {
		System.out.println("This is spring first example");
	}

	public GreetingImpl()
	{
		System.out.println("GreetingImpl Constructor object created");
	}
	
}
