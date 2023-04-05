package Ejercicios.Basicos;

public class GatoRepaso {

	public static boolean isCatPlaying(boolean verano, int temperatura) {
		if (verano == true)
			if (temperatura >= 25 && temperatura <= 45)
				return true;
			else
				return false;
		else if (temperatura >= 25 && temperatura <= 35)
			return true;
		else
			return false;
	}
}
