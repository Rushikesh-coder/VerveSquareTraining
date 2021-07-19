package com.day5.com;

import java.util.Random;

public class Utilities {
	Random objRandomClass = new Random();

	public String openURl() {

		String strURL = "https://www.facebook.com/r.php \nPage Opened Successfully";
		return strURL;
	}

	public String verifyCreateNewAccountPageisDisplayed() {

		String strTextWeGet = "Create a new account";
		String strActualText = "Create a new account";
		String strResult = "";
		if (strTextWeGet.equals(strActualText)) {
			strResult = "verified: Create a new account page is displayed Successfully";
		} else {
			strResult = "Page is faild to displayed";
		}
		return strResult;

	}

	public String setName(int intLength) {
		String charaToz = "abcdefghijklmnopqrstuvwxyz";
		String strRandomName = "";
		for (int i = 0; i < intLength; i++) {
			int intRandomNumber = (int) (Math.random() * charaToz.length());
			strRandomName += charaToz.substring(intRandomNumber, intRandomNumber + 1);
		}
		return strRandomName;
	}
	

	public String setLastName(int intLength) {
		String charaToz = "abcdefghijklmnopqrstuvwxyz";
		String strRandomLastName = "";
		for (int i = 0; i < intLength; i++) {
			int intRandomNumber = (int) (Math.random() * charaToz.length());
			strRandomLastName += charaToz.substring(intRandomNumber, intRandomNumber + 1);
		}
		return strRandomLastName;
	}

	public String setMobileNumber(String strStartNumber) {

		String strRandomMobileNumber = strStartNumber;
		for (int intIndex = 0; intIndex < 8; intIndex++) {
			strRandomMobileNumber = strRandomMobileNumber + (int) (Math.random() * 9);
		}

		return strRandomMobileNumber;
	}

	public String setNewPassword() {
		String strPassword = "Name@";

		for (int intIndex = 0; intIndex < 3; intIndex++) {
			strPassword = strPassword + (int) (Math.random() * 100);
		}
		return strPassword;
	}

	public int setDay() {

		int intDay = 0; // Day
		intDay = intDay + (int) (Math.random() * 31);
		if (intDay == 0) {
			intDay = 1 + intDay;
		}
		return intDay;
	}

	public String setMonth() {
		String strArrayMonth[] = { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" }; // Month
		String strRandomMonth = strArrayMonth[objRandomClass.nextInt(strArrayMonth.length - 1)];
		return strRandomMonth;

	}

	public int setYear(int intYearStartsfrom) {
		int intYearTemp = 0;
		int intYear = 0; // Year
		for (int intIndex = 0; intIndex < 100; intIndex++) {
			intYearTemp = objRandomClass.nextInt(2021);
			if (intYearTemp > intYearStartsfrom) {
				intYear = intYearTemp;
				break;
			}
		}
		return intYear;
	}

	public String setGender() {
		String strGender[] = { "Male", "Female", "Custom" };
		String strRandomRedio = strGender[objRandomClass.nextInt(strGender.length - 1)];
		return strRandomRedio;
	}

	public String clickButton() {
		String strclick = "Clicked on SignUp Button";

		return strclick;
	}

}
