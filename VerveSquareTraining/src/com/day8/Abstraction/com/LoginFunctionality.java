package com.day8.Abstraction.com;

public abstract class LoginFunctionality {
	String strUserName = "Jack";
	String strPassword = "Jack@123";

	public abstract boolean loginFunctionality();

	public abstract void verifyLogIn();
	
	public void Banner()
	{
		System.out.println("********************************Enjoy Our service******************************");
	}
	

}
