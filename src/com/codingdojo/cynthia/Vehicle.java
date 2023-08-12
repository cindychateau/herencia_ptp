package com.codingdojo.cynthia;

public class Vehicle {
	
	private int year; //Solo se usan en la clase que los genra
	private String brand;
	private String model;
	private int wheels;
	protected int speed = 0; //pueden ser consultadas y editadas por los hijos
	
	public Vehicle() {
	}

	public Vehicle(int year, String brand, String model, int wheels) {
		this.year = year;
		this.brand = brand;
		this.model = model;
		this.wheels = wheels;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getWheels() {
		return wheels;
	}

	public void setWheels(int wheels) {
		this.wheels = wheels;
	}

	@Override
	public String toString() {
		return "Vehicle [year=" + year + ", brand=" + brand + ", model=" + model + ", wheels=" + wheels + "]";
	}

	
	
}
