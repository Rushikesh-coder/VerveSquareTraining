package com.day8.Interface.com;

public interface WorldBank {

	public abstract void currency();
	
	public void countryCode();
	
	public void statesCount();
	
	public abstract void unionTeritory();
	
	
	
	public static void benifitiars(String Country)
	{
		System.out.println("\n==============="+Country+" : Partener of World Bank==================");
	}
	
	public default void bankName()
	{
		System.out.println("This Is World Bank");
	}
}
