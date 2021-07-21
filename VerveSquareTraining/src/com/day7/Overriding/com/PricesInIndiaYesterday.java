package com.day7.Overriding.com;

public class PricesInIndiaYesterday {

	double dblPetrol;
	double dblDiesel;
	double dblAlmondOil;

	public void mumbaiOilPrice() {
		dblPetrol = 100.05;
		dblPetrol = 91.84;
		dblAlmondOil = 60.65;
		System.out.println("\n================Oil Prices in Mumbai====================\n");
		if (dblPetrol >= 100) {
			System.out.println("Price of Petrol Today is " + dblPetrol + " [  High  ]");
		} else if (dblPetrol >= 92) {
			System.out.println("Price of Petrol Today is " + dblPetrol + " [  Medium  ]");
		} else if (dblPetrol > 80) {
			System.out.println("Price of Petrol Today is " + dblPetrol + " [  Avg  ]");
		} else {
			System.out.println("Price of Petrol Today is " + dblPetrol + " [  low  ]");
		}

//		System.out.println("============================Diesel Price===============================");

		if (dblDiesel >= 100) {
			System.out.println("Price of Diesel Today is " + dblDiesel + " [  High  ]");
		} else if (dblDiesel >= 92) {
			System.out.println("Price of Diesel Today is " + dblDiesel + " [  Medium  ]");
		} else if (dblDiesel > 80) {
			System.out.println("Price of Diesel Today is " + dblDiesel + " [  Avg  ]");
		} else {
			System.out.println("Price of Diesel Today is " + dblDiesel + " [  low  ]");
		}

//		System.out.println("============================Almond Oil Price===============================");

		if (dblAlmondOil >= 100) {
			System.out.println("Price of Almond Today is " + dblAlmondOil + " [  High  ]");
		} else if (dblAlmondOil >= 92) {
			System.out.println("Price of Almond Today is " + dblAlmondOil + " [  Medium  ]");
		} else if (dblAlmondOil > 80) {
			System.out.println("Price of Almond Today is " + dblAlmondOil + " [  Avg  ]");
		} else {
			System.out.println("Price of Almond Today is " + dblAlmondOil + " [  low  ]");
		}

	}

	public void DelhiOilPrice() {

		dblPetrol = 107.05;
		dblPetrol = 98.84;
		dblAlmondOil = 81.65;

		System.out.println("\n================Oil Prices in Delhi====================\n");
		if (dblPetrol >= 100) {
			System.out.println("Price of Petrol Today is " + dblPetrol + " [  High  ]");
		} else if (dblPetrol >= 92) {
			System.out.println("Price of Petrol Today is " + dblPetrol + " [  Medium  ]");
		} else if (dblPetrol > 80) {
			System.out.println("Price of Petrol Today is " + dblPetrol + " [  Avg  ]");
		} else {
			System.out.println("Price of Petrol Today is " + dblPetrol + " [  low  ]");
		}

		// System.out.println("============================Diesel
		// Price===============================");

		if (dblDiesel >= 100) {
			System.out.println("Price of Diesel Today is " + dblDiesel + " [  High  ]");
		} else if (dblDiesel >= 92) {
			System.out.println("Price of Diesel Today is " + dblDiesel + " [  Medium  ]");
		} else if (dblDiesel > 80) {
			System.out.println("Price of Diesel Today is " + dblDiesel + " [  Avg  ]");
		} else {
			System.out.println("Price of Diesel Today is " + dblDiesel + " [  low  ]");
		}

//		System.out.println("============================Almond Oil Price===============================");

		if (dblAlmondOil >= 100) {
			System.out.println("Price of Almond Today is " + dblAlmondOil + " [  High  ]");
		} else if (dblAlmondOil >= 92) {
			System.out.println("Price of Almond Today is " + dblAlmondOil + " [  Medium  ]");
		} else if (dblAlmondOil > 80) {
			System.out.println("Price of Almond Today is " + dblAlmondOil + " [  Avg  ]");
		} else {
			System.out.println("Price of Almond Today is " + dblAlmondOil + " [  low  ]");
		}

	}

	public void PuneOilPrice() {

		dblPetrol = 97.44;
		dblPetrol = 72;
		dblAlmondOil = 60;
		System.out.println("\n================Oil Prices in Pune====================\n");
		if (dblPetrol >= 100) {
			System.out.println("Price of Petrol Today is " + dblPetrol + " [  High  ]");
		} else if (dblPetrol >= 92) {
			System.out.println("Price of Petrol Today is " + dblPetrol + " [  High  ]");
		} else if (dblPetrol < 80) {
			System.out.println("Price of Petrol Today is " + dblPetrol + " [  High  ]");
		} else {
			System.out.println("Price of Petrol Today is " + dblPetrol + " [  High  ]");
		}

//		System.out.println("============================Diesel Price===============================");

		if (dblDiesel >= 100) {
			System.out.println("Price of Diesel Today is " + dblDiesel + " [  High  ]");
		} else if (dblDiesel >= 92) {
			System.out.println("Price of Diesel Today is " + dblDiesel + " [  Medium  ]");
		} else if (dblDiesel > 80) {
			System.out.println("Price of Diesel Today is " + dblDiesel + " [  Avg  ]");
		} else {
			System.out.println("Price of Diesel Today is " + dblDiesel + " [  low  ]");
		}

//		System.out.println("============================Almond Oil Price===============================");

		if (dblAlmondOil >= 100) {
			System.out.println("Price of Almond Today is " + dblAlmondOil + " [  High  ]");
		} else if (dblAlmondOil >= 92) {
			System.out.println("Price of Almond Today is " + dblAlmondOil + " [  Medium  ]");
		} else if (dblAlmondOil > 80) {
			System.out.println("Price of Almond Today is " + dblAlmondOil + " [  Avg  ]");
		} else {
			System.out.println("Price of Almond Today is " + dblAlmondOil + " [  low  ]");
		}

	}

}
