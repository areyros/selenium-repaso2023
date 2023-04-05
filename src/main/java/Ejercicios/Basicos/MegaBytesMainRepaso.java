package Ejercicios.Basicos;

import java.util.Scanner;

public class MegaBytesMainRepaso {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		String resp;
		MegaBytesRepaso objeto = new MegaBytesRepaso();
		int megas;
		do {
			System.out.println("Dame los kilooooos:");
			megas = scan.nextInt();
			objeto.printMegaBytesAndKiloBytes(megas);
			System.out.println("Deseas continuar?");
			resp = scan.next();
		} while (resp.equals("si"));
	}
}
