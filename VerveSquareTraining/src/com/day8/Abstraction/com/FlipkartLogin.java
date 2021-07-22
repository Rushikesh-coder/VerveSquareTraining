package com.day8.Abstraction.com;

public class FlipkartLogin extends LoginFunctionality {
	String strDataBaseUserName = "Jhon";
	String strDataBasePassword = "Jhon@123";
	String strHomePage = "Flipkart";
	boolean LogOutButton = true;

	@Override
	public boolean loginFunctionality() {

		boolean blnVerify = false;
		if (strUserName.equals(strDataBaseUserName) && strPassword.equals(strDataBasePassword)) {

			blnVerify = true;
		}

		else {
			blnVerify = false;
		}

		return blnVerify;
	}

	@Override
	public void verifyLogIn() {
		if (loginFunctionality() == true && LogOutButton == true) {
			System.out.println("UserName And Password Is Correct");
			System.out.println("You are Log in Successfully To " + strHomePage);
			super.Banner();
		} else {
			System.out.println("Something Is Wrong");

			System.out.println("Login Faild Try Again");
		}

	}

}
