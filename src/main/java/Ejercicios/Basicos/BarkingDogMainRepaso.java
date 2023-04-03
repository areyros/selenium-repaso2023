package Ejercicios.Basicos;

import java.util.Scanner;

public class BarkingDogMainRepaso {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String resp;
		Scanner scan = new Scanner(System.in);
		boolean respuesta;
		int hora;
		BarkingDogRepaso dog = new BarkingDogRepaso();

		do {

			System.out.println("El perro está ladrando (true/false) ?");
			respuesta = scan.nextBoolean();
			System.out.println("Que hora es?");
			hora = scan.nextInt();
			System.out.println("La respuesta del metodo, debería despertarse? " + dog.shouldWakeUp(respuesta, hora));
			System.out.println("Deseas iniciar nuevamente?");
			resp = scan.next();
		} while (resp.equals("si"));
	}

}
