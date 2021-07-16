package com.day4.com;

public class StringsMethodsInJava {

	String strWords = "Picture Perfect";
	String strWordsSpace = "     Picture Perfect           ";
	Integer intValue = 66;

	public void strStringMethods() {
		System.out.println();
		System.out.println("String Length Method =" + strWords.length());
		System.out.println("String charAt Method =" + strWords.charAt(6));
		System.out.println("String IndexOf Method string=" + strWords.indexOf("Per"));
		System.out.println("String IndexOf Method char =" + strWords.indexOf('c'));
		System.out.println("String IndexOf Method fromIndex =" + strWords.indexOf('e', 8));
		System.out.println("String indent Method =" + strWords.indent(4));
		System.out.println("String trim Method =" + strWordsSpace.trim());
		System.out.println("String lastIdexOf Method =" + strWords.lastIndexOf('t'));
		System.out.println("String lastIdexOf fromIndex Method =" + strWords.lastIndexOf('P', 10));
		System.out.println("String toLowerCase Method =" + strWords.toLowerCase());
		System.out.println("String toUpperCase Method =" + strWords.toUpperCase());
		System.out.println("String StartsWith Method =" + strWords.startsWith("Pic"));
		System.out.println("String endsWith Method =" + strWords.endsWith("ect"));
		System.out.println("String toString Method =" + intValue.toString() + 10);
		
		

	}

	public void stringReplaceMethod() {
		System.out.println("Replace:-");
		String strSentence = "Rajesh is a good persion. Rajesh likes playing Cricket";
		String strModSentence = strSentence.replace("Rajesh", "Rohit");
		System.out.println(strModSentence);
		String strReplaceAllMethod = strSentence.replaceAll("Rajesh is a good persion.", "Rajesh is a good Cricket.");
		System.out.println(strReplaceAllMethod);

	}
	public void stringMethodsReturnBoolean() {
		System.out.println("Return Boolean:-");
		String strWords = "Picture Perfect";
		String strWordsNew = "picture perfect";
		String strContain=" ";

		System.out.println("equals Method   "+strWords.equals(strWordsNew));
		System.out.println("equalsIgnoreCase Method   "+strWords.equalsIgnoreCase(strWordsNew));
		System.out.println("contains Method   "+strWords.contains("Perfect"));
		System.out.println("isBlank Method   "+strContain.isBlank());
		System.out.println("isEmpty Method   "+strContain.isEmpty());
		

	}
	
	public void stringSplitMethod()
	{
		System.out.println("\nSplit Method:-\n");
		String strSentence = "Rajesh is a good persion. Rajesh likes playing Cricket";
		String strArrayWords[]=strSentence.split("\\s");
		
		for(String arrayOfWords: strArrayWords)
		{
			System.out.println(arrayOfWords);
		}
	}
	
	public void stringSubString()
	{
		
		System.out.println("SubString Method:-");
		String strSentence = "Rajesh is a good persion. Rajesh likes playing Cricket";
		System.out.println("Compete String:   "+strSentence);
		
		System.out.println("SubString:   "+strSentence.substring(26));
		
		
	}

}
