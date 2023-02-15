package com.userRegistration;

import java.util.regex.Pattern;

public class RegexSampleEmail {

public static void  main(String[] args) {
	String passwardRegex = "^([_a-zA-Z0-9-]+(\\.[_a-zA-Z0-9-]+)*@[a-zA-Z0-9-]+(\\.[a-zA-Z0-9-]+)*(\\.[a-zA-Z]{2,6}))?$";
	String passward1 = "abc@yahoo.com";
	boolean result = Pattern.matches(passwardRegex, passward1);
	
	String passward2 = "abc-100@yahoo.com";
	@SuppressWarnings("unused")
	boolean result2 = Pattern.matches(passwardRegex, passward2);
	System.out.println(result2);
	
	String passward3 = "abc.100@yahoo.com";
	@SuppressWarnings("unused")
	boolean result3 = Pattern.matches(passwardRegex, passward3);
	System.out.println(result3);
	
	String passward4 = "abc111@abc.com";
	@SuppressWarnings("unused")
	boolean result4 = Pattern.matches(passwardRegex, passward4);
	System.out.println(result4);
	
	String passward5 = "abc-100@abc.net";
	@SuppressWarnings("unused")
	boolean result5 = Pattern.matches(passwardRegex, passward5);
	System.out.println(result5);
	
	String passward6 = "abc.100@abc.com.au";
	@SuppressWarnings("unused")
	boolean result6 = Pattern.matches(passwardRegex, passward6);
	System.out.println(result6);
	
	String passward7 = "abc.100@abc.com.au";
	@SuppressWarnings("unused")
	boolean result7 = Pattern.matches(passwardRegex, passward7);
	System.out.println(result7);
	
	String passward8 = "abc.100@abc.com.au";
	@SuppressWarnings("unused")
	boolean result8 = Pattern.matches(passwardRegex, passward8);
	System.out.println(result8);
  }

}