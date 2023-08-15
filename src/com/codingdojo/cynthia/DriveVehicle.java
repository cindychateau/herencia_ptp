package com.codingdojo.cynthia;

/*Representan ACCIONES que podemos implementar en las clases*/
public interface DriveVehicle {
	
	/* 3 métodos
	 * Abstracto: aquellos que OBLIGAMOS a nuestra clase  a implementar
	 * Default: no necesita ser implementado sino que lo creamos directo
	 * Estáticos: pertenecer a la interfaz
	 */
	
	abstract void turnRight();
	abstract void turnLeft();
	
	default void drive() {
		System.out.println("Estamos manejando el vehiculo");
	}
	
	default void stop() {
		System.out.println("Detenemos el vehiculo");
	}
	
	static void queHaceInterface() {
		System.out.println("La interface se encarga de poder dar las acciones de manejar a los vehiculos");
	}
	
}
