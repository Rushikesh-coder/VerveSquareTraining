package com.day2.com;

public class ControlStatements {
	
	public void ifstatement(String strNameofCountry)       //Method for if statement.
	{
		if(strNameofCountry.equals("India"))
		{
			System.out.println("you are a Indian Citizen");
		}
	}
	
	public void ifelsestatement(String strNameofCountry)    //Method for if else statement.
	{
		if(strNameofCountry.equals("India"))
		{
			System.out.println("you are a Indian Citizen");
		}
		else
		{
			System.out.println("you are not a Indian citizen");
		}
	}
	
	public void ifelseNestedstatement(String strNameofCountry)    //Method for Nested if else statement.
	{
		
		this.ifelsestatement("Chaina");
		
		if(strNameofCountry.equalsIgnoreCase("India"))
		{
			System.out.println("you are a Indian Citizen");
		}
		else if(strNameofCountry.equals("Chaina"))
		{
			System.out.println("you are not a Indian citizen");
		}
		else if(strNameofCountry.equalsIgnoreCase("Nepal"))
		{
			System.out.println("you are not a Indian citizen");
		}
		else
		{
			System.out.println("You are from outside Ashian");
		}
	}	
}
