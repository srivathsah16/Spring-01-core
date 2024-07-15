package com.loosecoupling.paymentapp;

public class PaymentApp {
	public static void main(String[] args) {
		IPayment payment=new DebitCardPayment();
		PaymentService payService = new PaymentService(payment);
		payService.setPayment(new CreditCardPayment());
		payService.doPayment(6500);
	}
}
