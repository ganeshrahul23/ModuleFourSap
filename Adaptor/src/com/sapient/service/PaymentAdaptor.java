package com.sapient.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.paypal.service.IPayPal;
import com.paypal.service.PayPalSerImpl;

public class PaymentAdaptor {
	private IPayPal payPal = new PayPalSerImpl();
	
	public void makePayment(List<String> lst) {
		Map<String, String> cMap = new HashMap<>();
		cMap.put("cname", lst.get(0));
		cMap.put("card", lst.get(1));
		cMap.put("cvv", lst.get(2));
		payPal.doPayment(cMap);
	}
}
