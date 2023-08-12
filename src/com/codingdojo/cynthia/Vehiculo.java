package com.codingdojo.cynthia;

public class Vehiculo {
	
	protected int anio; //protected: Le permite acceder al dato a todos mis hijos
	private String marca;
	private String modelo;
	private String color;
	private int ruedas;
	protected int velocidad = 0;
	
	public Vehiculo() {
	}

	public Vehiculo(String color) {
		this.color = color;
	}

	public Vehiculo(int anio, String marca, String modelo, String color, int ruedas) {
		this.anio = anio;
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.ruedas = ruedas;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getRuedas() {
		return ruedas;
	}

	public void setRuedas(int ruedas) {
		this.ruedas = ruedas;
	}
	
	public void imprimir() {
		System.out.println("Anio:"+this.anio+" Marca:"+this.marca+" Modelo:"+this.modelo+" Color:"+this.color+" Ruedas:"+this.ruedas);
	}
	
}
