package com.harshith.spring;

public class Doctor 
{
	private int id;
	private String name;
	
	public Doctor(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public void docInfo()
	{
		System.out.println("Doctor id : "+id+", Name : "+name);
	}
	
}
