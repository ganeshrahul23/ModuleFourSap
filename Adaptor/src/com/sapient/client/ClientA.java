package com.sapient.client;

import java.util.ArrayList;
import java.util.List;

import com.sapient.service.IPaymentService;
import com.sapient.service.PaymentSerImpl;

public class ClientA {

	public static void main(String[] args) {
//		IPaymentService ser = new PaymentSerImpl();
//		List<String> lst = new ArrayList<String>();
//		lst.add("gan");
//		lst.add("ram");
//		lst.add("tom");
//		ser.makePayment(lst);
		
		IPaymentService ser = new PaymentSerImpl();
		List<String> lst = new ArrayList<String>();
		lst.add("gan");
		lst.add("ram");
		lst.add("tom");
		ser.makePayment(lst);
	}
}
