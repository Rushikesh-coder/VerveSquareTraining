package com.day6.Multilevel.com;

class SecondStanderd extends FirstStanderd // Child Class 
{

	public void detailsOfSecond() {
		
		this.detailsOfFirst();
		strName = "Sachin";
		intYear = 2020;
		intPersentageObtained=92;
		SchoolName = "ABCD HighSchool";
		System.out.println("Name of Student :" + strName + " Year : " + intYear +" Percentage : "+intPersentageObtained+ " School Name :" + SchoolName);
	}

}