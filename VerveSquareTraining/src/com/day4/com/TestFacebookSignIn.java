package com.day4.com;

public class TestFacebookSignIn {

	public static void main(String[] args) {
		FacebookSignIn objFacebookSignIn=new FacebookSignIn();
		
		objFacebookSignIn.openURl();
		System.out.println("\n");
		objFacebookSignIn.VerifyCreateNewAccountPageisDisplayed();
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
