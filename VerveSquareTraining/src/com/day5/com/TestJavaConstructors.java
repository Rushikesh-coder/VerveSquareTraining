package com.day5.com;

public class TestJavaConstructors {

	public static void main(String[] args) {
		JavaConstructors objJavaConstructors=new JavaConstructors();
		JavaConstructors objJavaConstructorsParameterized=new JavaConstructors("RealMe","RealMe 5 Pro",2018);
		JavaConstructors objJavaConstructorsSingleArggument=new JavaConstructors(2020);

		objJavaConstructors.mobilesDetails();                         // Parameterless constructor
		objJavaConstructorsParameterized.mobilesDetails();           // Parameterized constructor
		objJavaConstructorsSingleArggument.mobilesDetails();        // Parameterized Different Argument constructor
		
	}

}
