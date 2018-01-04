package com.sapient.client;

import com.sapient.service.Palindrome;
import com.sapient.service.Palindromebuffer;

public class Client {
	public static void main(String[] args) {
		Palindromebuffer pObj = new Palindromebuffer(new Palindrome());
		String [] arr = {"amar","mam","malayalam"};
		pObj.checkPalindrome(arr);
	}
}
