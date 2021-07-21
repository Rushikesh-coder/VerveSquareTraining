package com.day7.SuperAndFinal.com;

public class TravelFinal{

	final String strDestination="Bangalore"; //Can not change
	final String strStartFrom="Pune";        //can not change
    int intDistance=840;
	String strTime="10:00";
	
	public void byRoad() {
		System.out.println("Traveling Details from Pune To Bangalore by Road : ");
		//strDestination="Channai";
	   //strStartFrom="Mumbai";
		
		intDistance=900;
		strTime="15:00";
		System.out.println("Starting Point : "+strStartFrom+"\nDestination : "+strDestination+"\nDistnce : "+intDistance+" KM"+"\nTime Req. : "+strTime+" Hours\n");
	}
	public void byAir() {
		System.out.println("Traveling Details from Pune To Bangalore by Air : ");
		//strDestination="Jalgaon";
		//strStartFrom="Channai";
		
		intDistance=850;
		strTime="01:50";
		System.out.println("Starting Point : "+strStartFrom+"\nDestination : "+strDestination+"\nDistnce : "+intDistance+" KM"+"\nTime Req. : "+strTime+" Hours\n");
	}
	public final void byTrain()   //Method can not be Override
	{
		System.out.println("Traveling Details from Pune To Bangalore by Train: ");
		//strDestination="Goa";
		//strStartFrom="Mumbai";
		
		intDistance=855;
		strTime="10:08";
		System.out.println("Starting Point : "+strStartFrom+"\nDestination : "+strDestination+"\nDistnce : "+intDistance+" KM"+"\nTime Req. : "+strTime+" Hours");
	}
	
}
