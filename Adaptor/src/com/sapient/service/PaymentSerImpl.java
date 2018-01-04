package com.sapient.service;

import java.util.List;

public class PaymentSerImpl implements IPaymentService {
	
	private PaymentAdaptor adaptor = new PaymentAdaptor();
	@Override
	public void makePayment(List<String> lst) {
		System.out.println("Payment Done");
		adaptor.makePayment(lst);
	}

}
