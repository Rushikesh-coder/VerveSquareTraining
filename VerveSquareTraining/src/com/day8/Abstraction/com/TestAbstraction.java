package com.day8.Abstraction.com;

public class TestAbstraction {

	public static void main(String[] args) {
	
		System.out.println("\nLogIn for Amazon :");
		AmazonLogin objAmazonLogin=new AmazonLogin();
		objAmazonLogin.loginFunctionality();
		objAmazonLogin.verifyLogIn();

		System.out.println("\nLogIn for Flipkart : ");
		FlipkartLogin objFlipkartLogin=new FlipkartLogin();
		objFlipkartLogin.loginFunctionality();
		objFlipkartLogin.verifyLogIn();
	}

}
