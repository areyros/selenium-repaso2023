package Ejercicios.Basicos;

import java.util.Scanner;

public class ImprimeVerificadorMainRepaso {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String resp;
		ImprimirVerificadorRepaso objeto = new ImprimirVerificadorRepaso();
		int x, y, z;
		do {
			System.out.println("Dame el 1er valor");
			x = scan.nextInt();
			System.out.println("Dame el 2do valor");
			y = scan.nextInt();
			System.out.println("Dame el 3er valor");
			z = scan.nextInt();
			System.out.println("El resultado del metodo es:");
			objeto.imprimirVerificadorNumeros(x, y, z);
			System.out.println("Deseas continuar?");
			resp = scan.next();
		} while (resp.equals("si"));
	}
}
