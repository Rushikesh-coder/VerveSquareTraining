package com.day7.SuperAndFinal.com;

public class UserFirst {

	//           Data of User
	
	int intsrNumber = 06;
	String strName = "Saurabh";
	String strCity = "Pune";
	String strCountry = "India";
	boolean blnLegal = false;

	public UserFirst() {

		System.out.println(" Constructor Called Parent Class");

	}

	public boolean userVerification() {

		if (strCountry.equalsIgnoreCase("India")) {
			blnLegal = true;
		}
		
		return blnLegal;

	}
}
