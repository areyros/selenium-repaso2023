package Ejercicios.Basicos;

import java.util.Scanner;

public class DecimalRepasoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DecimalRepaso objeto = new DecimalRepaso();
		double k, j;
		String resp;
		Scanner scan = new Scanner(System.in);
		do {
			System.out.println("Dame el primer valor:");
			k = scan.nextDouble();
			System.out.println("Dame el segundo valor:");
			j = scan.nextDouble();
			System.out.println(
					"A 3 decimales, los 3 decimales son iguales? " + objeto.areEqualByThreeDecimalPlaces(k, j));
			System.out.println("Deseas iniciar nuevamente?");
			resp = scan.next();
		} while (resp.equals("si"));
	}
}