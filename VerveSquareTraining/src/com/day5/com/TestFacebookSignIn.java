package com.day5.com;

public class TestFacebookSignIn {

	public static void main(String[] args) {
		FacebookSignIn objFacebookSignIn=new FacebookSignIn();
		
		objFacebookSignIn.openURl();
		System.out.println("\n");
		objFacebookSignIn.verifyCreateNewAccountPageisDisplayed();
		System.out.println("\n");
		objFacebookSignIn.setName();
		System.out.println("\n");
		objFacebookSignIn.setLastName();
		System.out.println("\n");
		objFacebookSignIn.setMobileNumber();
		System.out.println("\n");
		objFacebookSignIn.setNewPassword();
		System.out.println("\n");
		objFacebookSignIn.setDateOfBirth();
		System.out.println("\n");
		objFacebookSignIn.setGender();
		System.out.println("\n");
		objFacebookSignIn.clickOnSignUpButton();

	}

}
