package com.sapient.client;

import java.util.Scanner;

import com.sapient.service.EmpService;
import com.sapient.service.IEmpSer;

public class Client {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String opt = null;
		IEmpSer ser = null;
		int eid = 0;
		do{
			ser = EmpService.getInstance();
			System.out.print("Enter EID : ");
			eid = sc.nextInt();
			try {
				System.out.println(ser.display(eid));
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			System.out.println("Press y to continue");
			opt = sc.next();
		}while(opt.equals("y"));
		sc.close();
	}
}
