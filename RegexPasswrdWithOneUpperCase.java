package com.userRegistration;

import java.util.regex.Pattern;

public class RegexPasswrdWithOneUpperCase {
		
	public static void  main(String[] args) {
		String passwardRegex = "^(?=.*[A-Z])[A-Za-z]{8,}$";
		String passward = "nikitAryan";
		boolean result = Pattern.matches(passwardRegex, passward);
		
		System.out.println(result);
	}

}
