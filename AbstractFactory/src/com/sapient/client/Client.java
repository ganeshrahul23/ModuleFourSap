package com.sapient.client;

import java.util.Collection;
import java.util.Scanner;

import com.sapient.service.CollectionFactory;

public class Client {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String type;
		System.out.print("Enter the type : ");
		type = sc.nextLine();
		
		try {
			Collection<String> col = CollectionFactory.getCollection(type);
			col.add("ram");
			col.add("tom");
			System.out.println(col);
			System.out.println(col.getClass().getSimpleName());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
}
