package Ejercicios.Basicos;

import java.util.Scanner;

public class CocheVelocidadRepaso {

	public static void main(String[] args) {
//		* Crear un programa que valide el limite de velocidad de un coche cuando vaya en una carretera,
		// zona escolar o calle normal utilizando
//		estructuras condicionales con IF
//
//		********* Nota: Tomar como ejemplo el ejercicio realizado en clase. ***************
		String resp;
		Scanner scan = new Scanner(System.in);
		int limiteVelocidadCarretera = 120;
		int limiteVelocidadCalleNormal = 80;
		int limiteVelocidadZonaEscolar = 40;
		int velocidad;

		do {
			System.out.println("A que velocidad vas?");
			velocidad = scan.nextInt();
			if (velocidad > limiteVelocidadCarretera)
				System.out.println("Estas a exceso de velocidad en CARRETERA");
			if (velocidad > limiteVelocidadCalleNormal)
				System.out.println("Estas a exceso de velocidad en CALLE NORMAL");
			if (velocidad > limiteVelocidadZonaEscolar)
				System.out.println("Estas a exceso de velocidad en ZONA ESCOLAR");
			else
				System.out.println("Vas bajo el limite de velocidad de zona escolar");
			System.out.println("Limite carretera: " + limiteVelocidadCarretera);
			System.out.println("Limite zona escolar: " + limiteVelocidadZonaEscolar);
			System.out.println("Limite calle normal: " + limiteVelocidadCalleNormal);
			System.out.println("Quieres intentarlo nuevamente?: ");
			resp = scan.next();
		} while (resp.equals("si"));
	}
}