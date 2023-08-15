package com.codingdojo.cynthia;

/*Me hereda de la clase Vehicle*/
public class Car extends Vehicle implements DriveVehicle, Mantenimiento {
	
	/*Me hereda todas las variables miembro/atributos y métodos
	 * Solo las nuevas variables miembro son las que tenemos que escribir
	 * */
	private String licensePlate;

	public Car(int year, String brand, String model, int wheels, String licensePlate) {
		//Llama al constructor de la clase superior/padre (Vehicle)
		super(year, brand, model, wheels);
		this.licensePlate = licensePlate;
	}

	public String getLicensePlate() {
		return licensePlate;
	}

	public void setLicensePlate(String licensePlate) {
		this.licensePlate = licensePlate;
	}

	@Override
	public String toString() {
		return super.toString()+ "Car [licensePlate=" + licensePlate + "]";
	}
	
	public void accelerate() {
		System.out.println("Let's accelerate");
		this.speed += 2;
		System.out.println("My speed is:"+this.speed);
	}
	
	public void decelerate() {
		System.out.println("I'm decelerating");
		this.speed -= 2;
		System.out.println("My speed is:"+this.speed);
	}
	
	public void turnRight() {
		System.out.println("Ponemos la direccional con flecha a la derecha");
		System.out.println("Coloca al volante volteando a la derecha");
	}
	
	public void turnLeft() {
		System.out.println("Ponemos la direccional con flecha a la izquierda");
		System.out.println("Coloca al volante volteando a la izquierda");
	}
	
}
