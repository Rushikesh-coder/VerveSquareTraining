package com.day3.com;

public class LoopsControlStatements {

	int intCountryCode[] = { 91, 1, 44, 61, 7, 94 };
	String strCountryName[] = { "India", "USA", "UK", "Austrelia", "Russia", "Shri Lanka" };

	String strCountryCode[] = { "91", "1", "44", "61", "7", "94" };

	public void forLoopStatement()  //for Loop
	{
		System.out.println("Printing using for Loop");
		for (int intIndex = 0; intIndex < intCountryCode.length; intIndex++) {

			System.out.println("Country Code = " + intCountryCode[intIndex] + " Country Name = "
					+ strCountryName[intIndex] + "\n");
		}
	}

	public void whileLoopStatement()  //ehile loop
	{
		System.out.println("Printing using while Loop");
		int intCount = 0;

		while (intCountryCode.length > intCount) {
			System.out.println("Country Code = " + intCountryCode[intCount] + " Country Name = "
					+ strCountryName[intCount] + "\n");
			intCount++;
		}

	}

	public void doWhileLoopStetement()  //do while loop
	{
		System.out.println("Printing using do while Loop");
		int intCount = 0;
		do {
			System.out.println("Country Code = " + intCountryCode[intCount] + " Country Name = "
					+ strCountryName[intCount] + "\n");
			intCount++;
		} while (intCountryCode.length > intCount);

	}

	public void enhanceforLoopStatement()  //enhance for loop 
	{

		String strMyCart[] = { "Apple", "Mangos", "Banana", "Orange", "Graps" };
		System.out.println("Printing using Enhance For Loop");

		for (String strName : strMyCart) {

			System.out.println(strName);
		}
	}

	public void enhanceforLoopStatementNew() // printing two Arrays using enhance for Loop
	{
		String strCountryName[] = { "India", "USA", "UK", "Austrelia", "Russia", "Shri Lanka" };
		String strCountryCode[] = { "91", "1", "44", "61", "7", "94" };

		System.out.println("Printing Two Arrays using  Enhance For Loop");

		int intCurrentCode = 0;
		for (String strName : strCountryName) {

			String intTemp = strCountryCode[intCurrentCode];

			intCurrentCode++;
			for (String strCode : strCountryCode) {

				if (strCode == intTemp) {
					System.out.println("Country Code = " + strCode + " Country Name = " + strName + "\n");
				}

			}

		}

	}

	public void breakStatement(String breakFromHere) {
		System.out.println("Break Statement in for Loop");
		for (int intIndex = 0; intIndex < intCountryCode.length; intIndex++) {

			if (strCountryName[intIndex].equals(breakFromHere)) {
				break;
			}
			System.out.println("Country Code = " + intCountryCode[intIndex] + " Country Name = "
					+ strCountryName[intIndex] + "\n");
		}
	}

	public void continueStatement(String Skipthis) {
		System.out.println("Continue Statement in for Loop");
		for (int intIndex = 0; intIndex < intCountryCode.length; intIndex++) {

			if (strCountryName[intIndex].equals(Skipthis)) {
				continue;
			}
			System.out.println("Country Code = " + intCountryCode[intIndex] + " Country Name = "
					+ strCountryName[intIndex] + "\n");
		}
	}

}
