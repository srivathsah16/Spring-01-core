package com.loosecoupling.carapp;

public class DieselEngine implements IEngine {

	@Override
	public int start() {
		System.out.println("Diesel Engine started...");
		return 1;
	}
}
