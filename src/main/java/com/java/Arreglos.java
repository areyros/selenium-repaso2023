package com.java;

import java.util.Scanner;

public class Arreglos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		// Arreglo unidimencional

		String[] dias = { "lunes", "martes", "miercoles", "jueves", "viernes", "sabado", "domingo" };
		int contdo = 0;
		System.out.println("ARREGLO UNIDIMENCIONAL");
		do {
			System.out.println("La posición de la variable contdo es: " + contdo
					+ " QUE equivale en el arreglo a la posición: dias[" + contdo + "] = " + dias[contdo]);
			contdo++;
		} while (contdo < dias.length);

		// Arreglo Bidimencional

		System.out.println("ARREGLO BIDIMENCIONAL");
		String[][] arreglo = new String[2][2];
		for (int i = 0; i < arreglo.length; i++) {
			for (int j = 0; j < arreglo.length; j++) {
				System.out.println("Dame el valor para la posición arreglo[" + i + "][" + j + "]=");
				arreglo[i][j] = scan.next();
			}
		}

		for (int i = 0; i < arreglo.length; i++) {
			for (int j = 0; j < arreglo.length; j++) {
				System.out.println("arreglo[" + i + "][" + j + "]=" + arreglo[i][j]);
			}
		}

		// Arreglo MULTIDIMENCIONAL

//		System.out.println("ARREGLO MULTIDIMENCIONAL");
//		
//		int a1[]=0,a2=0,a3=0,a4=0;
//		
//		for(n=0;n<4;n++) {
//			System.out.println("Dame el valor de la dimencion "+n+1+"=");
//			a
//		}
		
		int[][][][] dimension = new int[2][2][2][2];
		for (int i = 0; i < dimension.length; i++) {
			for (int j = 0; j < dimension.length; j++) {
				for (int a = 0; a < dimension.length; a++) {
					for (int b = 0; b < dimension.length; b++) {
						System.out.println(
								"Dame el valor para la posición arreglo[" + i + "][" + j + "][" + a + "][" + b + "]=");
						dimension[i][j][a][b] = scan.nextInt();
					}
				}
			}
		}

		for (int i = 0; i < dimension.length; i++) {
			for (int j = 0; j < dimension.length; j++) {
				for (int a = 0; a < dimension.length; a++) {
					for (int b = 0; b < dimension.length; b++) {
						System.out.println(
								"arreglo[" + i + "][" + j + "][" + a + "][" + b + "]=" + dimension[i][j][a][b]);
					}
				}
			}
		}
	}

}
