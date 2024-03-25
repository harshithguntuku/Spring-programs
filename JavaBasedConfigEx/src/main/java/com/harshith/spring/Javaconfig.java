package com.harshith.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Javaconfig
{
	@Bean
	public Doctor doctor()
	{
		Doctor doctor =new Doctor(1002,"Harry");
		return doctor;
	}
	
	@Bean
	public Pharmacy pharmacy()
	{
		Pharmacy pharmacy = new Pharmacy("Honeyy Medicals", "Ameerpet");
		return pharmacy;
	}
	
	@Bean
	public Patient patient()
	{
		Patient patient = new Patient("Ravi", 28, doctor(), pharmacy());
		return patient;
	}
	
}
