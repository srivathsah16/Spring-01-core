package com.loosecoupling.carapp;

public class Car {
	
	private IEngine engine;
	
	public Car(IEngine engine) {
		this.engine = engine;
	}
	
	public void drive() {
		int value = engine.start();
		if (value > 0) {
			System.out.println("Journey Started...");
		} else {
			System.out.println("Problem with engine...");
		}
	}
}
