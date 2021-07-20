package com.day6.com;

public class MethodOverLoading {

	public void CalculeteNumber(int intNumber, int intNumberTwo) {
		int intResult = intNumber + intNumberTwo;
		System.out.println("Addition of two Integer Numbers "+intNumber+" and "+intNumberTwo+" is " + intResult);
	}

	public void CalculeteNumber(double dblNumber, double dblNumberTwo) {
		double dblResult = dblNumber + dblNumberTwo;
		System.out.println("Addition of two double Numbers "+dblNumber+" and "+dblNumberTwo+" is " + dblResult);
	}

	public void CalculeteNumber(int intNumber, double dblNumberTwo) {
		double dblResult = intNumber + dblNumberTwo;
		
		System.out.println("Addition of Integer and double Number is "+intNumber+" and "+dblNumberTwo+" is " + dblResult);
	}
	
	
	public void CalculeteNumber(int intNumber, int intNumberTwo, int intNumberThird) {
		int intResult = intNumber + intNumberTwo + intNumberThird;
		System.out.println("Addition of Three Integer Numbers "+intNumber+" and "+intNumberTwo+" "+ intNumberThird+" is " + intResult);
	}

	
	public void setCricketerName(String strName) {
		System.out.println("Name of Cricketer :" + strName);
	}

	public void setCricketerName(String strName, int intODIRanking) {
		System.out.println("Name of Cricketer : " + strName);
		System.out.println("ODI Ranking : " + intODIRanking);
	}

	public void setCricketerName(String strName, int intODIRanking, String IPLTeam) {
		System.out.println("Name of Cricketer : " + strName);
		System.out.println("ODI Ranking : " + intODIRanking);
		System.out.println("IPL Team : " + IPLTeam);

	}

}
