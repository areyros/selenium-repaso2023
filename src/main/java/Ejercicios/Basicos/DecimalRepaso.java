package Ejercicios.Basicos;

public class DecimalRepaso {

	public static boolean areEqualByThreeDecimalPlaces(double a, double b) {
		int x, y;
		a *= 1000;
		b *= 1000;
		x = (int) a;
		y = (int) b;
		if (x == y)
			return true;
		else
			return false;
	}
}
