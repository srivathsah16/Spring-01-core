package com.loosecoupling.paymentapp;

public class CreditCardPayment implements IPayment {

	@Override
	public boolean processPayment(double billAmt) {
		// some logic
		System.out.println("Credit card payment is processed.");
		return true;
	}

}
