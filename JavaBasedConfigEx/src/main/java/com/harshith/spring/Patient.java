package com.harshith.spring;

public class Patient 
{
	private String name;
	private int age;
	private Doctor doctor;
	private Pharmacy pharmacy;
	public Patient(String name, int age, Doctor doctor, Pharmacy pharmacy) {
		super();
		this.name = name;
		this.age = age;
		this.doctor = doctor;
		this.pharmacy = pharmacy;
	}
	
	public void details()
	{
		System.out.println("Patient name : "+name);
		System.out.println("Age : "+age);
		doctor.docInfo();
		pharmacy.pharInfo();
	}
	
}
