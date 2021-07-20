package com.day6.com;

public class TestMethodOverLoading {

	public static void main(String[] args) {
		
		MethodOverLoading objMethodOverLoading=new MethodOverLoading();
		objMethodOverLoading.CalculeteNumber(450,500);
		objMethodOverLoading.CalculeteNumber(42.05, 54.85);
		objMethodOverLoading.CalculeteNumber(200, 187.4);
		objMethodOverLoading.CalculeteNumber(5, 10, 20);
		System.out.println("====================Cricketers Details======================");
		objMethodOverLoading.setCricketerName("Virat Kohali");
		objMethodOverLoading.setCricketerName("Rohit Sharma", 02);
		objMethodOverLoading.setCricketerName("Jasprit Boomrah", 55, "Mumbai Indians");

	}

}
