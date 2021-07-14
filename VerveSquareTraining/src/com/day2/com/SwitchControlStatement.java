package com.day2.com;

public class SwitchControlStatement {

	static void switchstetement(int intIdCardNumber) {

		switch (intIdCardNumber) {
		case 401:
			System.out.println("Name of Id Card Holder " + intIdCardNumber + " is = Rupam");
			break;
		case 402:
			System.out.println("Name of Id Card Holder " + intIdCardNumber + " is = Akash");
			break;
		case 403:
			System.out.println("Name of Id Card Holder " + intIdCardNumber + " is = Nilesh");
			break;
		case 404:
			System.out.println("Name of Id Card Holder " + intIdCardNumber + " is = Rushikesh");
			break;
		case 405:
			System.out.println("Name of Id Card Holder " + intIdCardNumber + " is = Priyanka");
			break;
		case 406:
			System.out.println("Name of Id Card Holder " + intIdCardNumber + " is = Sadiya");
			break;
		case 407:
			System.out.println("Name of Id Card Holder " + intIdCardNumber + " is = Piush");
			break;
		default:
			System.out.println("Details Not In The Database");
		}
	}
}
