package numeric;

import java.util.Scanner;

public class Float {
	
	/**
	 * Permite escribir un decimal por teclado.
	 * 
	 * @return Retorna el decimal introducido por teclado.
	 */
	public static float writeNumber() {
		@SuppressWarnings("resource")
		Scanner escribir = new Scanner(System.in);
		return escribir.nextFloat();
	}
	
	/**
	 * Genera un numero aleatorio entre un minimo y un maximo.
	 * 
	 * @param min
	 *            Valor minimo.
	 * @param max
	 *            Valor maximo.
	 * @return Retorna un valor.
	 */
	public static float generateRandomNumber(int min, int max) {
		return (float) (Math.random() * (max - min + 1)) + min;
	}
	
}
