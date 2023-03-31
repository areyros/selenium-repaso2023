package com.java;

import java.util.Scanner;

public class RepasoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Gato cat = new Gato();
		
		System.out.println("dame el nombre del gato:");
		Scanner scan = new Scanner(System.in);
		cat.setNombre(scan.next());
		
		System.out.println("El nombre ya en la clase es: "+cat.getNombre());
		String nombreMain=cat.getNombre();
		System.out.println("llamado de metodo:" + cat.juega(nombreMain));
		System.out.println("nuevo nombre"+nombreMain);
		
		
	}

}
