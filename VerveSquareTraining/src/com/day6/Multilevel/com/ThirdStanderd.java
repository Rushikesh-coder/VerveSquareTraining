package com.day6.Multilevel.com;

class ThirdStanderd extends SecondStanderd // Child Class 
{
	
	public void detailsOfThird() {
		this.display();
		this.detailsOfSecond();
		strName = "Sachin";
		intYear = 2021;
		intPersentageObtained=72;
		SchoolName = "ABCD HighSchool";
		System.out.println("Name of Student :" + strName + " Year : " + intYear +" Percentage : "+intPersentageObtained+ " School Name :" + SchoolName);
	}
	
}