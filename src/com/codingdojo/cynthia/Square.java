package com.codingdojo.cynthia;

public class Square extends Shape {
	
	private double length;
	
	public Square(double length) {
		this.length = length;
	}
	

	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}


	@Override //Sobreescribimos cualquier método que tenga el mismo nombre
	double area() {
		return this.length*this.length;
	}




	
}
