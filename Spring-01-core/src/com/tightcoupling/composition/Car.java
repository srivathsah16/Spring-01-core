package com.tightcoupling.composition;

public class Car {
	private Engine engine;  // HAS-A relationship
	public void drive() {
		engine=new Engine();
		int value = engine.start();
		if (value > 0) {
			System.out.println("Journey started");
		} else {
			System.out.println("Problem with engine...");
		}
	}
}
