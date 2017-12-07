package Numeric;

public class Integer {

	public static void main(String[] args) {
		System.out.println(checkPrime(6));
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
}
