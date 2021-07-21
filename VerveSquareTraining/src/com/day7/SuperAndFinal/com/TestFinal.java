package com.day7.SuperAndFinal.com;

public class TestFinal extends TravelFinal {

	@Override
	public void byRoad() {
		System.out.println("calling Parent Method");
		super.byRoad();

	}

	@Override
	public void byAir() {

		System.out.println("calling Parent Method");
		super.byAir();
		super.byTrain();
	}

//	@Override
//	public final void byTrain() {
//		super.byTrain();
//	}

	public static void main(String[] args) {
		TravelFinal objTravelFinal=new TravelFinal();
		objTravelFinal.byRoad();
		objTravelFinal.byAir();
		objTravelFinal.byTrain();
	}

}
