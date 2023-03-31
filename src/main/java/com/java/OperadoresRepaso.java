package com.java;

public class OperadoresRepaso {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// operadores aritemicos - + / *
		int a = 1;
		int b = 2;

		int suma = a + b;
		int resta = a - b;
		int multiplicacion = a * b;
		int division = a / b;

		System.out.println("La suma de " + a + " y " + b + " es: " + suma);
		System.out.println("La resta de " + a + " y " + b + " es: " + resta);
		System.out.println("La multipliacion de " + a + " y " + b + " es: " + multiplicacion);
		System.out.println("La division de " + a + " y " + b + " es: " + division);

		// operadores unarios ++ --

		int incremento = 6;
		int decremento = 3;

		incremento++;
		decremento--;

		System.out.println(incremento - 1 + " incremento en uno= " + incremento); // tambien se puede con el
																					// ++incremento
		System.out.println(decremento - 1 + " decremento en uno= " + decremento); // tambien se puede con el
																					// --decremento

		// Operadores Relacionales == != < > >= <=
		int n = 5, m = 10;
		System.out.println("n es igual a " + n);
		System.out.println("m es igual a " + m);

		if (n == m) {
			System.out.println("== VERDADERO");
		} else
			System.out.println("== FALSO");

		if (n != m) {
			System.out.println("!= VERDADERO");
		} else
			System.out.println("!= FALSO");

		if (n < m) {
			System.out.println("< VERDADERO");
		} else
			System.out.println("< FALSO");

		if (n > m) {
			System.out.println("> VERDADERO");
		} else
			System.out.println("> FALSO");

		// Operadores condicionales && ||

		if (n != m && n < m) {
			System.out.println("&& VERDADERO");
		} else
			System.out.println("&& FALSO");

		if (n != m || n == m) {
			System.out.println("|| VERDADERO");
		} else
			System.out.println("|| FALSO");

	}
}
