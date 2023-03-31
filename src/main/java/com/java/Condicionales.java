package com.java;

import java.util.Scanner;

public class Condicionales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Ejercicio de limite de velocidad con condicionales
		int limiteVelocidad = 0;
		int velocidadActual = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Dame el límite de velocidad:");
		limiteVelocidad = scan.nextInt();
		System.out.println("El valor ingresado es: " + limiteVelocidad);
		System.out.println("A que velocidad vas?:");
		velocidadActual = scan.nextInt();

		// IF
		System.out.println("IF");
		if (limiteVelocidad < velocidadActual)
			System.out.println("Vas a exceso de velocidad, tu velocidad es de " + velocidadActual
					+ " y lo máximo es de " + limiteVelocidad);

		// IF ELSE
		System.out.println("IF ELSE");
		if (limiteVelocidad < velocidadActual)
			System.out.println("Vas a exceso de velocidad, tu velocidad es de " + velocidadActual
					+ " y lo máximo es de " + limiteVelocidad);
		else
			System.out.println(
					"Vas a velocidad normal de " + velocidadActual + " Cuando el límite es de: " + limiteVelocidad);

		// IF ELSE IF
		System.out.println("IF ELSE IF");
		boolean carretera = false;

		if (carretera) {
			System.out.println("bandera de carretera activada");
			limiteVelocidad = 120;
			if (limiteVelocidad > velocidadActual) {
				System.out.println("Vas en carretera pero tu velocidad es de " + velocidadActual + " y el limite es de "
						+ limiteVelocidad);
			}
		} else if (velocidadActual > limiteVelocidad)
			System.out.println("Vas a exceso de velocidad, tu velocidad es de " + velocidadActual
					+ " y lo máximo es de " + limiteVelocidad);
		// SWICH CASE

		int caso = 3;
		switch (caso) {
		case 1: {
			System.out.println("Este es el número 1");
			System.out.println("switch 1");
			break;
		}
		}
		caso = 2;
		switch (caso) {
		case 2: {
			System.out.println("Este es el número 2");
			System.out.println("switch 2");
			break;
		}
		}
	}
}
