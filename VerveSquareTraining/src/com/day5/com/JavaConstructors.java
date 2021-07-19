package com.day5.com;

public class JavaConstructors {

	String strMobileName;
	String strMobileBrand;
	int intLauncYear;

	
	public JavaConstructors() //		Parameterless Constructor
	{
//		System.out.println("Parameterless Constructor\n");
		strMobileName = "Nokia 7 Plus";
		strMobileBrand = "Nokia";
		intLauncYear = 2021;

	}
	
	public JavaConstructors(String strMobileName, String strMobileBrand, int intLauncYear)  // Parameterized Constructor
	{
//		System.out.println("Parameterized Constructors\n");
		this.strMobileName=strMobileName;
		this.strMobileBrand=strMobileBrand;
		this.intLauncYear=intLauncYear;		
	
	}
	
	public JavaConstructors(int intLaunchDate)
	{
		intLauncYear=intLaunchDate;
		strMobileName="Samsang M20";
		strMobileBrand="Samsang";
		
	}
	

	public void mobilesDetails() {
		System.out.println("\nSmart Phone Details :\nCompany Name : " + strMobileBrand + "\nModel : " + strMobileName+ "\nLaunch Year : " + intLauncYear);
	}
}
