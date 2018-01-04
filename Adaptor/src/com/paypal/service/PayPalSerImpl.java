package com.paypal.service;

import java.util.Map;

import com.sapient.service.PaymentAdaptor;

public class PayPalSerImpl implements IPayPal {
	
	@Override
	public void doPayment(Map<String, String> custMap) {
		System.out.println("cust name " + custMap.get("cname"));
		System.out.println("Card no " + custMap.get("card"));
		System.out.println("PayPal payment done");		
	}
}
