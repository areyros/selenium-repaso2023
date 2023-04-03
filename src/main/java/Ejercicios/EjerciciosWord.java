package Ejercicios;

import java.util.Scanner;

public class EjerciciosWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		//EJERCICIO 1
//		Crear una clase (public static void main) con tres variables de 
//		tipo double e imprimir la suma, resta, multiplicación y división de las 3 variables.  
//	
//		double var1;
//		double var2;
//		double var3;
		Scanner scan = new Scanner(System.in);
//		System.out.println("EJERCICIO 1 \n");
//		System.out.println("Dame el primer valor:");
//		var1 = scan.nextDouble();
//		System.out.println("Dame el segundo valor:");
//		var2 = scan.nextDouble();
//		System.out.println("Dame el tercer valor:");
//		var3 = scan.nextDouble();
//		System.out.println("Los valores son: \nvar1=" + var1 + "\nvar2=" + var2 + "\nvar3=" + var3);
//		double suma = var1 + var2 + var3;
//		System.out.println("La suma de los 3 valores es: " + suma);
//		double resta = var1 - var2 - var3;
//		System.out.println("La suma de los 3 valores es: " + resta);
//		double multiplicacion = var1 * var2 * var3;
//		System.out.println("La suma de los 3 valores es: " + multiplicacion);
//		double division = var1 / var2 / var3;
//		System.out.println("La suma de los 3 valores es: " + division);
//
////		Ejercicio #2 
////		Crear una clase (public static void main) con 4 variables tipo String con los siguientes valores: 
////		Var 1 = “Cool” 
////		Var 2 = “Selenium con Java” 
////		Var 3 = “Curso de” 
////		Var 4 = “Testers” 
////		El programa debe imprimir el siguiente mensaje utilizando la concatenación de Java: 
////		“Curso de Selenium con Java CoolTesters”.
//
//		String v1 = "Cool";
//		String v2 = "Selenium con Java";
//		String v3 = "Curso de";
//		String v4 = "Testers";
//		System.out.println("EJERCICIO 2");
//		System.out.println("valores delas variables \nv1=" + v1 + "\nv2=" + v2 + "\nv3=" + v3 + "\nv4=" + v4);
//		System.out.println("Concatenación correcta en orden:" + v3 + " " + v2 + " " + v1 + v4);

//		Ejercicio #3 
//		Escribe la declaración más apropiada para cada una de las siguientes variables. 
//		El nombre de cada una indica el tipo de dato que contendrá y servirá para determinar el tipo de dato
//		más adecuado en la declaración de la variable. 
//		a) edad                                                b) códigoPostal 
//		c) altura                                              d) genero (valores: H: hombre, M: mujer)                    
//		e) nombre                                              f) númeroDeHijos 
//		g) iva (valores: % a aplicar)                          h) tallaCamisa (valores numéricos) 
//		i) peso                                                j) precio  
//		k) alumnoRepetidor  (valores: SI/NO)                   l) mensaje 
//		m) letra                                               n)mayorEdad                                                
//		o) minutos                                             p) días 
//		q) matriculaCoche                                      r) contador 
//		s) mayorDeEdad  (valores: verdadero/falso)             t) tallaCamiseta (valores: S, L, XL...) 

//		int edad = 18;
//		double altura = 1.72;
//		String nombre = "Alejandro";
//		double iva = 15;
//		double peso = 55;
//		boolean alumnoRepetidor = true;
//		char letra = 'A';
//		double minutos = 30.5;
//		String matriculaCoche = "BA14T";
//		boolean mayorDeEdad = true;
//		String codigiPostal = "08400";
//		char genero = 'M';
//		int numeroDeHijos = 0;
//		int tallaCamisa = 36;
//		double precio = 40000;
//		String mensaje = "Vendra ya el trabajo en SPF";
//		int mayorEdad = 18;
//		String[] dias = { "Lunes", "Martes", "Miercoles", "etc" };
//		int contador = 0;
//		String tallaCamiseta = "Mediana";

//		Ejercicio #4
//		Declara 2 variables numéricas enteras (con el valor que desees), he indica cual es mayor de los dos. 
//		Si son iguales indicarlo también. Ves cambiando los valores para comprobar que funciona.

		String resp=null;
//		do {
//			int a = 0, b = 0;
//			System.out.println("Dame el valor de a:");
//			a = scan.nextInt();
//			System.out.println("Dame el valor de b:");
//			b = scan.nextInt();
//			if (a > b) {
//				System.out.println("El valor a=" + a + " Es mayor que b=" + b);
//			} else if (a < b) {
//				System.out.println("El valor a=" + a + " Es menor que b=" + b);
//			} else
//				System.out.println("El valor a=" + a + " Es igual que b=" + b);
//			System.out.println("Quieres probar de nuevo?");
//			resp = scan.next();
//		} while (resp.equals("si");
//		
//		
//		Ejercicio #5 
//		Crea un programa donde te pida un número y muestra si es positivo o negativo y si es par o impar 

		do{ 
			int num;
			System.out.println("Dame el valor del numero:");
			num = scan.nextInt();

			if (num < 0)
				System.out.println("El numero es NEGATIVO:" + num);
			else if (num > 0)
				System.out.println("El numero es POSITIVO:" + num);
			else
				System.out.println("El numero numero es 0:" + num);

			
			if (num==0)
				System.out.println("Tu numero es 0 por lo tanto no puede ser par o inpar");
			else {
			if (num % 2 == 0)
				System.out.println("El numero es PAR:" + num);
			else 
				System.out.println("El numero es IMPAR:" + num);
			}
			System.out.println("Quieres probar de nuevo?");
			resp = scan.next();
		}while (resp.equals("si"));
	}
}
