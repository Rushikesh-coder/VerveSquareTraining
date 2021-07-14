package com.day2.com;

public class TestControlStatement {
	static void printingDetails() {
		System.out.println("Use of Different Control Statement");
	}

	public static void main(String[] args) {

		printingDetails();
		ControlStatements objControlStatements = new ControlStatements();

		objControlStatements.ifstatement("India");
		System.out.println();
		objControlStatements.ifelsestatement("USA");
		System.out.println("\nNested:-");
		objControlStatements.ifelseNestedstatement("USA");

		System.out.println("**************************switch Statement*****************************");

		SwitchControlStatement.switchstetement(403);
	}

}
