package com.userRegistration;
import java.util.regex.Pattern;

public class RegexValidPhoneNumber {
	
	public static void  main(String[] args) {
		String phoneNumberRegex = "^[0-9]{2}\\s[0-9]{10}$";
		String phoneNumber = "91 7042003665";
		boolean result = Pattern.matches(phoneNumberRegex, phoneNumber);
		
		System.out.println(result);
	}

}