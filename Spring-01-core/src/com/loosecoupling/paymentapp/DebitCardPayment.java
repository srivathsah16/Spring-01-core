package com.loosecoupling.paymentapp;

public class DebitCardPayment implements IPayment {
	@Override
	public boolean processPayment(double billAmt) {
		// some logic
		System.out.println("Debit card payment is processed.");
		return true;
	}
}
