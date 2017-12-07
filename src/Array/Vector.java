package Array;

import Numeric.Integer;

public class Vector {

	/**
	 * Recorre y muestra un vector por consola.
	 * 
	 * @param vector
	 */
	public static void show(int[] vector) {
		for (int i = 0; i < vector.length; i++) {
			System.out.print(vector[i] + " ");
		}
	}

	/**
	 * Establece la longitud de un vector.
	 * 
	 * @param longitud
	 * @return Retorna el vector con una longitud establecida.
	 */
	public static int[] setIntSize(int longitud) {
		int vector[] = new int[longitud];
		return vector;
	}

	/**
	 * Comprueba si un vector está ordenado ascendentemente.
	 * 
	 * @param vector
	 * @return Retorna TRUE si está ordenado ascendentemente o FALSE si no.
	 */
	public static boolean checkAscendingOrder(int[] vector) {
		for (int i = 0; i < vector.length - 1; i++) {
			if (vector[i] > vector[i + 1]) {
				return false;
			}
		}
		return true;
	}

	/**
	 * Comprueba si un vector está ordenado descendentemente.
	 * 
	 * @param vector
	 * @return Retorna TRUE si está ordenado descendentemente o FALSE si no.
	 */
	public static boolean checkDescendingOrder(int[] vector) {
		for (int i = 0; i < vector.length - 1; i++) {
			if (vector[i] < vector[i + 1]) {
				return false;
			}
		}
		return true;
	}

	/**
	 * Comprueba si el vector está ordenado.
	 * 
	 * @param vector
	 * @return Retorna TRUE si está ordenado o FALSE si no lo está.
	 */
	public static boolean checkOrdered(int[] vector) {
		if (checkAscendingOrder(vector) || checkDescendingOrder(vector))
			return true;
		else
			return false;
	}

	/**
	 * Ordena un vector ascendentemente.
	 * 
	 * @param vector
	 * @return Retorna el vector ordenado.
	 */
	public static int[] sortAscending(int[] vector) {
		int valorAux;
		while (!checkAscendingOrder(vector)) {
			for (int i = 0; i < vector.length - 1; i++) {
				if (vector[i] > vector[i + 1]) {
					valorAux = vector[i];
					vector[i] = vector[i + 1];
					vector[i + 1] = valorAux;
				}
			}
		}
		return vector;
	}

	/**
	 * Ordena un vector descendentemente.
	 * 
	 * @param vector
	 * @return Retorna el vector ordenado.
	 */
	public static int[] sortDescending(int[] vector) {
		int valorAux;
		while (!checkDescendingOrder(vector)) {
			for (int i = 0; i < vector.length - 1; i++) {
				if (vector[i] < vector[i + 1]) {
					valorAux = vector[i];
					vector[i] = vector[i + 1];
					vector[i + 1] = valorAux;
				}
			}
		}
		return vector;
	}

	/**
	 * Desordena un vector de valores enteros.
	 * 
	 * @param vector
	 * @return Retorna el vector desordenado.
	 */
	public static int[] mess(int[] vector) {
		int valorAux;
		for (int i = 0; i <= 1000; i++) {
			for (int j = 0; j < vector.length; j++) {
				int posicion = Integer.generateRandomNumber((vector.length - 1), 0);
				valorAux = vector[j];
				vector[j] = vector[posicion];
				vector[posicion] = valorAux;
			}
		}
		return vector;
	}
}
