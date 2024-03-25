package com.harshith.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	//Start the container
    	ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
    	System.out.println("*****");
    	
    	//Get the object from container call your methods
    	GreetingImpl greetingImpl =context.getBean("greet", GreetingImpl.class);
    	greetingImpl.greet();

    }
}
