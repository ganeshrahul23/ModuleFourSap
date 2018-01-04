package com.sapient.service;

public class Palindrome {
	
	public void checkPalindrome(String str){
		boolean res = false;
		if(str == null)
			res = false;
		else if(str.isEmpty())
			res = false;
		else{
			StringBuilder sb = new StringBuilder(str).reverse();
			res = sb.toString().equals(str);
		}
		if(res)
			System.out.println(str + " is a Palindrome");
		else
			System.out.println(str + " is not a Palindrome");
	}
}
