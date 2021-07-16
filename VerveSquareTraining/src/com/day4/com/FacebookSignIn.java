package com.day4.com;

import java.util.Random;

public class FacebookSignIn {

	public void openURl() {

		System.out.println("https://www.facebook.com/r.php \nPage Opened Successfully");
	}

	public void VerifyCreateNewAccountPageisDisplayed() {

		String strTextWeGet = "Create a new account";
		String strActualText = "Create a new account";
		if (strTextWeGet.equals(strActualText)) {
			System.out.println("verified: Create a new account page is displayed Successfully");
		}
		else
		{
			System.out.println("Page is faild to displayed");
		}

	}

	Random objRandomClass=new Random(); // Random class
	
	public void setName() {

		String strName[]= {"Paresh","Rakesh","Akshay","Abhishekh","Rupam","Rohit","Rushikesh","Prakash","mahesh","Rajesh","Rutwik"};
		String strRandomName=strName[objRandomClass.nextInt(strName.length-1)];
		System.out.println("First Name Entered :   "+strRandomName);
	}

	public void setLastName() {

		String strLastName[]= {"Patil","Thakare","Deshmukh","Sonawne","Salunkhe","Pardeshi","Patnayak","Pakhle","Somwanshi"};
		
		String strRandomLastName=strLastName[objRandomClass.nextInt(strLastName.length-1)];
		System.out.println("Last Name Entered :   "+strRandomLastName);
	}

	public void setMobileNumber() {

		String strRandomMobileNumber = "";
		for(int intIndex=0;intIndex<10;intIndex++)
		{
			strRandomMobileNumber=strRandomMobileNumber+""+objRandomClass.nextInt(9);
		}
		
		System.out.println("Mobile Number Is Entered :    "+strRandomMobileNumber);
	}

	public void setNewPassword() {
		String strPassword = "Name@";

		for (int intIndex = 0; intIndex < 3; intIndex++) {
			strPassword = strPassword + "" + objRandomClass.nextInt(100);
		}
		System.out.println("Password Is Entered :    " + strPassword);
	}

	public void setDateOfBirth() {

		String strDay = "";            //Day
		strDay = strDay + objRandomClass.nextInt(31);
		if (strDay.length() == 1) {
			strDay = 0 + strDay;
		}

		String strArrayMonth[] = { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };  //Month
		String strRandomMonth = strArrayMonth[objRandomClass.nextInt(strArrayMonth.length-1)];
		
		int strYearTemp = 0;
		int strYear = 0;            // Year
		for (int intIndex = 0; intIndex < 100; intIndex++) {
			strYearTemp = objRandomClass.nextInt(2021);
			if (strYearTemp > 1905) {
				strYear = strYearTemp;
				break;
			}
		}

		System.out.println("date Is Enterd :   Day : " + strDay + " Month : " + strRandomMonth + " Year : " + strYear);

	}

	public void setGender() {

		String strGender[]= {"Male","Female","Custom"};
		String strRandomRedio=strGender[objRandomClass.nextInt(2)];
		System.out.println("Gender is Selected : "+strRandomRedio);
		
	}

	public void clickOnSignUpButton() {

		System.out.println("Clicked on SignUp Button");
	}
}
