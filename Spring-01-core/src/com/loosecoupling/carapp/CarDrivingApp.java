package com.loosecoupling.carapp;

public class CarDrivingApp {
	public static void main(String[] args) {
		Car myCar=new Car(new PetrolEngine());
		myCar.drive();
	}
}
