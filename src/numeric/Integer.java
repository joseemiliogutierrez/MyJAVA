package numeric;

import java.util.*;
import array.Vector;

public class Integer {

	/**
	 * Permite escribir un entero por teclado.
	 * 
	 * @return Retorna el entero introducido por teclado.
	 */
	public static int writeNumber() {
		@SuppressWarnings("resource")
		Scanner escribir = new Scanner(System.in);
		return escribir.nextInt();
	}

	/**
	 * Genera un numero aleatorio entre un minimo y un maximo.
	 * 
	 * @param max
	 *            Valor maximo.
	 * @param min
	 *            Valor minimo.
	 * @return Retorna un valor.
	 */
	public static int generateRandomNumber(int max, int min) {
		return (int) (Math.random() * (max - min + 1)) + min;
	}

	/**
	 * Comprueba si un numero es par o impar.
	 * 
	 * @param numero
	 * @return Retorna TRUE si el numero es par o FALSE si no lo es.
	 */
	public static boolean checkOddPair(int numero) {
		if (numero % 2 == 0)
			return true;
		else
			return false;
	}

	/**
	 * Comprueba si un número es primo.
	 * 
	 * @param numero
	 * @return Retorna TRUE si es primo o FALSE si no lo es.
	 */
	public static boolean checkPrime(int numero) {
		for (int i = 2; i <= numero; i++) {
			if (numero % i == 0 && i != numero)
				return false;
		}
		return true;
	}

	/**
	 * Almacena en un vector los divisores del número proporcionado.
	 * 
	 * @param numero
	 * @return Retorna un vector con los dividores del numero proporcionado.
	 */
	public static int[] extractDividers(int numero) {
		int longitud = 0;
		for (int i = 1; i <= numero; i++) {
			if (numero % i == 0)
				longitud++;
		}

		int[] divisores = Vector.setIntSize(longitud);

		for (int i = 1, posicion = 0; i <= numero; i++) {
			if (numero % i == 0) {
				divisores[posicion] = i;
				posicion++;
			}
		}
		return divisores;
	}
}
