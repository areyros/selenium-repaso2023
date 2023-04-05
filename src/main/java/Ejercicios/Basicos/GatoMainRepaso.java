package Ejercicios.Basicos;

import java.util.Scanner;

public class GatoMainRepaso {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String resp;
		boolean verano;
		int temperatura;
		GatoRepaso objeto = new GatoRepaso();

		do {
			System.out.println("estamos en verano?");
			verano = scan.nextBoolean();
			System.out.println("que temperatura estamos?");
			temperatura = scan.nextInt();
			System.out.println("El gato esta jugando: " + objeto.isCatPlaying(verano, temperatura));
			System.out.println("Deseas continuar?");
			resp = scan.next();
		} while (resp.equals("si"));
	}
}
