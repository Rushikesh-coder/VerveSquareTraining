package com.day8.Abstraction.com;

public class AmazonLogin extends LoginFunctionality {

	String strDataBaseUserName = "Jack";
	String strDataBasePassword = "Jack@123";
	String strHomePage = "Amazon";
	boolean LogOutButton = true;

	@Override
	public boolean loginFunctionality() {

		boolean blnVerify = false;
		if (strUserName.equals(strDataBaseUserName) && strPassword.equals(strDataBasePassword)) {

			blnVerify = true;
		}

		else {
			System.out.println("Something Is Wrong");
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
			System.out.println("LogIn Faild");
		}

	}
	
	

}
