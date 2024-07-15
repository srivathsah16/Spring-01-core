package com.tightcoupling.inheritance;

public class Car extends Engine {   // IS-A relationship
	public void drive() {
		int value = super.start();
		if (value > 0) {
			System.out.println("Journey started");
		} else {
			System.out.println("Problem with engine...");
		}
	}
}
