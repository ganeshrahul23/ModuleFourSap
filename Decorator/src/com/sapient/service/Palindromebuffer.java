package com.sapient.service;
public class Palindromebuffer {
	
	private Palindrome obj;
	
	public Palindromebuffer(Palindrome obj) {
		super();
		this.obj = obj;
	}
	
	public void checkPalindrome(String[] arr){
		for(String str:arr){
			obj.checkPalindrome(str);
		}	
	}
}
