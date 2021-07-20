package com.day6.com;

class MarutiSuzuki extends SingleInheritanceExampleCar  //Child Class
{
	public void detailsOfCar()
	{
		System.out.println("\n===============single Level Inheritance=======================\n");
		strName="MarutiSuzuki Swift";
		fuelType="Petrol";
		intModel=2021;
		
		System.out.println("Car Details :");
		System.out.println("Name : "+strName+"\nFuel Type : "+fuelType+"\nModel : "+intModel);
		
	}
}
