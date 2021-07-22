package com.day8.encapsuletion.com;

public class UserDetailsForPassport {

	private int intSrNumber = 107;
	private String strName = "Harry";
	private String strCity;
	private String strState;
	private String strCountry;
	private String strOccupation = "Manager at ABC";
	private String strIDNo = "018ABC468120";

	public int getIntSrNumber() {
		return intSrNumber;
	}

	public void setIntSrNumber(int intSrNumber) {
		this.intSrNumber = intSrNumber;
	}

	public String getStrName() {
		return strName;
	}

	public void setStrName(String strName) {
		this.strName = strName;
	}

	public String getStrCity() {
		return strCity;
	}

	public void setStrCity(String strCity) {
		this.strCity = strCity;
	}

	public String getStrState() {
		return strState;
	}

	public void setStrState(String strState) {
		this.strState = strState;
	}

	public String getStrCountry() {
		return strCountry;
	}

	public void setStrCountry(String strCountry) {
		this.strCountry = strCountry;
	}

	public String getOccupation() // read Only
	{
		return strOccupation;
	}

	public void setStrIDNo(String strIDNo) // write Only
	{
		this.strIDNo = strIDNo;
	}

}
