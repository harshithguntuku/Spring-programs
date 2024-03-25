package com.harshith.spring;

public class Person {
	private String name;
	private long mobile;
	private String email;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public void personInfo()
	{
		Person person = new Person();
		
		System.out.println("Hey "+name+" welcome to HARI CINEMAS" );
		System.out.println("Your Contact details: "+mobile);
		System.out.println("Your Mail details: "+email);

	}
}
