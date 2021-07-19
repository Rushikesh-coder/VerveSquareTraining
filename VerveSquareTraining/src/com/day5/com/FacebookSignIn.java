package com.day5.com;

public class FacebookSignIn {
	Utilities objUtilities = new Utilities();

	public void openURl() {

		System.out.println(objUtilities.openURl());
	}

	public void verifyCreateNewAccountPageisDisplayed() {

		System.out.println(objUtilities.verifyCreateNewAccountPageisDisplayed());
	}

	public void setName() {

		System.out.println("First Name is : " + objUtilities.setName(10));
	}

	public void setLastName() {

		System.out.println("Last Name is : " + objUtilities.setLastName(8));
	}

	public void setMobileNumber() {

		String strArrayOfNumbers[]= {"91","92","97","98","84","47"};
		int intRandomIndex=(int) (Math.random()*strArrayOfNumbers.length-1);
		String strConverted=String.valueOf(strArrayOfNumbers[intRandomIndex]);
		System.out.println("Mobile Number Is Entered :  " + objUtilities.setMobileNumber(strConverted));
	}

	public void setNewPassword() {

		System.out.println("Password Is Entered :  " + objUtilities.setNewPassword());
	}

	public void setDateOfBirth() {

		System.out.println("date Is Enterd :   Day : " + objUtilities.setDay() + " Month : " + objUtilities.setMonth()
				+ " Year : " + objUtilities.setYear(1950));

	}

	public void setGender() {

		System.out.println("Gender is Selected : " + objUtilities.setGender());

	}

	public void clickOnSignUpButton() {

		System.out.println(objUtilities.clickButton());
	}
}
