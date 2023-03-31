package com.java;

public class Gato {

	private String nombre;
	private String color;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	public Gato() {
		
	}
	
	public void comer() {
		System.out.println("El gato come croquetas:");
	}
	
	public String juega(String nombre) {
		System.out.println("El gato "+nombre);
		nombre="Metodo juega";
		return nombre;
	}

	
	
}
