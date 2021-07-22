package com.day8.Interface.com;

public class India implements WorldBank, OtherDetailsOfIndia
{

	String strCurrency = "INR";
	int intCode = 91;
	int intState = 29;
	int intUnionTeritory = 07;
	double dblCovidCase=3.4;
	double dblAgriculture=15.4;
	double dblService=66.4;
	

	@Override
	public void currency() {
		System.out.println("Currency of India : " + strCurrency+"\n");

	}

	@Override
	public void countryCode() {

		System.out.println("Country Code of India : " + intCode+"\n");
	}

	@Override
	public void statesCount() {
		System.out.println("Total States In India : " + intState+"\n");

	}

	@Override
	public void unionTeritory() {
		System.out.println("Total Union Teritory In India : " + intUnionTeritory+"\n");
		
	}

	@Override
	public void covidCases() {
		System.out.println("Total Covid Cases In India is :"+dblCovidCase+" Lakh"+"\n");
		
	}

	@Override
	public void agriculturalContribution() {
	
		System.out.println("Agricultiral Sector Contribution To india GDP : "+dblAgriculture+"%\n");
		
	}

	@Override
	public void ServiceSectorContribution() {
		System.out.println("Service Sector Contribution to India GDP : "+dblService+"%\n");
		
	}
	
	
}
