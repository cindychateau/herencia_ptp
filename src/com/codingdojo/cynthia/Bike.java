package com.codingdojo.cynthia;

public class Bike extends Vehicle implements DriveVehicle {
	
	//Constructor se hereda directamente de Vehicle
	public Bike(int year, String brand, String model, int wheels) {
		super(year, brand, model, wheels);
		// TODO Auto-generated constructor stub
	}

	//Mismo nombre de método PERO distintos comportamientos
	public void accelerate() {
		System.out.println("Let's pedal");
		this.speed += 1;
		System.out.println("My speed is:"+this.speed);
	}

	public void decelerate() {
		System.out.println("Feet down");
		this.speed -= 1;
		System.out.println("My speed is:"+this.speed);
	}

	@Override
	public void turnRight() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void turnLeft() {
		// TODO Auto-generated method stub
		
	}
	
	
}
