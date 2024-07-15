package com.loosecoupling.paymentapp;

public class SodexoPayment implements IPayment {

	@Override
	public boolean processPayment(double billAmt) {
		// some logic
		System.out.println("Sodex card payment is processed.");
		return true;
	}

}
