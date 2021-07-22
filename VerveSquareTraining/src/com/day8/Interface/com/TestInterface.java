package com.day8.Interface.com;

public class TestInterface {

	public static void main(String[] args) {
		
		India objIndia=new India();
		objIndia.currency();
		objIndia.countryCode();
		objIndia.statesCount();
		objIndia.unionTeritory();
		objIndia.agriculturalContribution();
		objIndia.ServiceSectorContribution();
		objIndia.covidCases();
		WorldBank.benifitiars("India");      //called by Interface
		
	}

}
