package com.harshith.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person 
{
//Autowiring using Fields	
//	@Autowired
	private HomeLoanService homeLoanService;
//	
//	@Autowired
	private RealEstateService realEstateService;
	
	
	
//	AutoWiring using Constructor	
//	@Autowired
//	public Person(HomeLoanService homeLoanService, RealEstateService realEstateService) {
//		super();
//		this.homeLoanService = homeLoanService;
//		this.realEstateService = realEstateService;
//	}

	
//	Autowiring Using setters
	public void details()
	{
		homeLoanService.loanInfo();
		realEstateService.realEstateInfo();
	}

	public HomeLoanService getHomeLoanService() {
		return homeLoanService;
	}


	@Autowired
	public void setHomeLoanService(HomeLoanService homeLoanService) {
		this.homeLoanService = homeLoanService;
	}


	public RealEstateService getRealEstateService() {
		return realEstateService;
	}

	@Autowired
	public void setRealEstateService(RealEstateService realEstateService) {
		this.realEstateService = realEstateService;
	}
}
