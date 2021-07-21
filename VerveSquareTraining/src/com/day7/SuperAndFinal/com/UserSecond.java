package com.day7.SuperAndFinal.com;

public class UserSecond extends UserFirst {
	int intsrNumber = 07;
	String strName = "Ronaldo";
	String strCity = "Washington";
	String strCountry = "USA";
	boolean blnLegal=false;

	public UserSecond() // constructor child class
	{

		super();
		System.out.println(" Constructor Called Child Class");

	}

	public boolean userVerification()   //Nationality Verification
	{

		if (strCountry.equalsIgnoreCase("India")) {
			blnLegal = true;
		}

		return blnLegal;

	}

	public void userDisplay() {
		
		System.out.println("\nUser Details :\nSr.Number : " + super.intsrNumber + "\nName : " + super.strName
				+ "\nCity : " + super.strCity + "\nCountry : " + super.strCountry);

		System.out.println("User verified as Indian : " + super.userVerification());

		
		System.out.println("\nUser Details :\nSr.Number : " + intsrNumber + "\nName : " + strName + "\nCity : " + strCity
				+ "\nCountry : " + strCountry);

		System.out.println("User verified as Indian : " + userVerification());

	}
}
