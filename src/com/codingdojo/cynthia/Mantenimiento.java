package com.codingdojo.cynthia;

public interface Mantenimiento {
	
	default void cambiarAceite() {
		System.out.println("Cambiamos el aceite del auto");
	}
	
}
