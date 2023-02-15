package com.userRegistration;
import java.util.regex.Pattern;

public class RegexValidFirstName {

	
	public static void  main(String[] args) {
		String firstNameRegex = "^[A-Z]{1}[a-zA-z]{2,}$";
		String FirstName = "Nikita";
		boolean result = Pattern.matches(firstNameRegex, FirstName);
		
		System.out.println(result);
	}

}