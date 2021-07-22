package com.day8.encapsuletion.com;

public class userDisplay extends UserDetailsForPassport {

	public void setDetails() {

		this.setIntSrNumber(144);
		this.setStrName("Robin");
		this.setStrCity("Dehli");
		this.setStrState("Dehli");
		this.setStrCountry("India");
		System.out.println("\n=================== Details set Successfully======================\n");
	}

	public void getDetails() {
		System.out.println("\n===================Getting Details=============================\n");
		System.out.println("Sr.Number : " + getIntSrNumber());
		System.out.println("Name : " + getStrName());
		System.out.println("City : " + getStrCity());
		System.out.println("State : " + getStrState());
		System.out.println("Country : " + getStrCountry());
	}

	public void readOnly() {
		// strOccupation="Senior Manager"; error

		System.out.println("Occupation of the person : " + getOccupation());

	}

	public void writeOnly() {
		this.setStrIDNo("104545ADR3544653");
		System.out.println("New Id No Is Set");

		// System.out.println("New Id No Is Set"+strIDNo); error
	}

}
