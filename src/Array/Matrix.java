package Array;

import Integer.Integer;

public class Matrix {

	/**
	 * Recorre y muestra los valores de una matriz de tipo entero.
	 * 
	 * @param matriz
	 */
	public static void showInt(int[][] matriz) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				System.out.print(matriz[i][j] + "\t");
			}
			System.out.println();
		}
	}

	/**
	 * Recorre y muestra los valores de una matriz de tipo caracter.
	 * 
	 * @param matriz
	 */
	public static void showChar(char[][] matriz) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}
	}

	/**
	 * Comprueba si una coordenada es contigua a otra dada mediante un bucle.
	 * 
	 * @param coordenadas
	 *            Coordenadas dadas a comprobar su contigua.
	 * @param i
	 *            Primer valor de coordenada contigua.
	 * @param j
	 *            Segundo valor de coordenada contigua.
	 * @return Retorna TRUE si es contigua o FALSE si no lo es.
	 */
	public static boolean checkContiguousLoop(int[] coordenadas, int i, int j) {
		if (coordenadas[0] == i && coordenadas[1] == j)
			return false;
		else if (Math.abs(coordenadas[0] - i) <= 1 && Math.abs(coordenadas[1] - j) <= 1) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Establece una longitud de matriz cuadrada de tipo ENTERO.
	 * 
	 * @param longitud
	 *            Longitud de la matriz.
	 * @return Retorna la matriz con una longitud establecida.
	 */
	public static int[][] setIntSize(int longitud) {
		int matriz[][] = new int[longitud][longitud];
		return matriz;
	}

	/**
	 * Establece una longitud de matriz cuadrada de tipo CARACTER.
	 * 
	 * @param longitud
	 *            Longitud de la matriz.
	 * @return Retorna la matriz con una longitud establecida.
	 */
	public static char[][] setCharSize(int longitud) {
		char matriz[][] = new char[longitud][longitud];
		return matriz;
	}

	/**
	 * Rellena una matriz de numeros anteros aleatorios entre un minimo y un maximo
	 * 
	 * @param matriz
	 * @param min
	 *            Valor minimo en matriz.
	 * @param max
	 *            Valor maximo en matriz.
	 * @return Retorna la matriz.
	 */
	public static int[][] fillRandomNumbers(int[][] matriz, int min, int max) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				matriz[i][j] = Integer.generateRandomNumber(max, min);
			}
		}
		return matriz;
	}

	/**
	 * Comprueba si una matriz cuadrada es triangular.
	 * 
	 * @param matriz
	 * @return Retorna TRUE si es triangular o FALSE si no lo es.
	 */
	public static boolean checkTriangular(int[][] matriz) {
		boolean triangularArriba = true, triangularAbajo = true;
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				if (i > j && matriz[i][j] != 0) {
					triangularAbajo = false;
				} else if (j > i && matriz[i][j] != 0) {
					triangularArriba = false;
				}
			}
		}
		return triangularAbajo || triangularArriba;
	}

	/**
	 * Comprueba si una matriz es diagonalmente dominante.
	 * 
	 * @param matriz
	 * @return Retorna TRUE si es dominante o FALSE si no lo es.
	 */
	public static boolean checkDiagonalDominant(int[][] matriz) {
		for (int i = 0; i < matriz.length; i++) {
			int acumulador = 0;
			for (int j = 0; j < matriz.length; j++) {
				if (i != j) {
					acumulador += matriz[i][j];
				}
				if (j == matriz.length - 1 && acumulador >= matriz[i][i]) {
					return false;
				}
			}
		}
		return true;
	}

	/**
	 * Comprueba si una matriz es identidad.
	 * 
	 * @param matriz
	 * @return Retorna TRUE si es identidad o FALSE si no lo es.
	 */
	public static boolean checkIdentity(int[][] matriz) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				if ((i == j && matriz[i][j] != 1) || (i != j && matriz[i][j] != 0)) {
					return false;
				}
			}
		}
		return true;
	}

	/**
	 * Comprueba si una matriz está ordenada ascendentemente.
	 * 
	 * @param matriz
	 * @return Retorna TRUE si está ordenada ascendentemente o FALSE en caso
	 *         contrario.
	 */
	public static boolean checkAscendingOrder(int[][] matriz) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length - 1; j++) {
				if (matriz[i][j] > matriz[i][j + 1])
					return false;
			}
			if (i != matriz.length - 1)
				if (matriz[i][matriz.length - 1] > matriz[i + 1][0])
					return false;
		}
		return true;
	}

	/**
	 * Comprueba si una matriz está ordenada descendentemente.
	 * 
	 * @param matriz
	 * @return Retorna TRUE si está ordenada descendentemente o FALSE en caso
	 *         contrario.
	 */
	public static boolean checkDescendingOrder(int[][] matriz) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length - 1; j++) {
				if (matriz[i][j] < matriz[i][j + 1])
					return false;
			}
			if (i != matriz.length - 1)
				if (matriz[i][matriz.length - 1] < matriz[i + 1][0])
					return false;
		}
		return true;
	}

	/**
	 * Comprueba si una matriz está ordenada.
	 * 
	 * @param matriz
	 * @return Retorna TRUE si está ordenada o FALSE en caso contrario.
	 */
	public static boolean checkOrdered(int[][] matriz) {
		if (checkAscendingOrder(matriz) || checkDescendingOrder(matriz))
			return true;
		else
			return false;
	}

	/**
	 * Ordena una matriz ascendentemente.
	 * 
	 * @param matriz
	 * @return Retorna la matriz ordenada.
	 */
	public static int[][] sortAscending(int[][] matriz) {
		int valorAux;
		while (!checkOrdered(matriz)) {
			for (int i = 0; i < matriz.length; i++) {
				for (int j = 0; j < matriz.length - 1; j++) {
					if (matriz[i][j] > matriz[i][j + 1]) {
						valorAux = matriz[i][j];
						matriz[i][j] = matriz[i][j + 1];
						matriz[i][j + 1] = valorAux;
					}
				}
				if (i != matriz.length - 1)
					if (matriz[i][matriz.length - 1] > matriz[i + 1][0]) {
						valorAux = matriz[i][matriz.length - 1];
						matriz[i][matriz.length - 1] = matriz[i + 1][0];
						matriz[i + 1][0] = valorAux;
					}
			}
		}
		return matriz;
	}

	/**
	 * Ordena una matriz descendentemente.
	 * 
	 * @param matriz
	 * @return Retorna la matriz ordenada.
	 */
	public static int[][] sortDescending(int[][] matriz) {
		int valorAux;
		while (!checkOrdered(matriz)) {
			for (int i = 0; i < matriz.length; i++) {
				for (int j = 0; j < matriz.length - 1; j++) {
					if (matriz[i][j] < matriz[i][j + 1]) {
						valorAux = matriz[i][j];
						matriz[i][j] = matriz[i][j + 1];
						matriz[i][j + 1] = valorAux;
					}
				}
				if (i != matriz.length - 1)
					if (matriz[i][matriz.length - 1] < matriz[i + 1][0]) {
						valorAux = matriz[i][matriz.length - 1];
						matriz[i][matriz.length - 1] = matriz[i + 1][0];
						matriz[i + 1][0] = valorAux;
					}
			}
		}
		return matriz;
	}

	/**
	 * Desordena una matriz de valores enteros.
	 * 
	 * @param matriz
	 * @return Retorna la matriz desordenada.
	 */
	public static int[][] mess(int[][] matriz) {
		int valorAux;
		for (int z = 0; z < 1000; z++) {
			for (int i = 0; i < matriz.length; i++) {
				for (int j = 0; j < matriz.length; j++) {
					int[] posicion = { Integer.generateRandomNumber(matriz.length - 1, 0),
							Integer.generateRandomNumber(matriz.length - 1, 0) };
					valorAux = matriz[i][j];
					matriz[i][j] = matriz[posicion[0]][posicion[1]];
					matriz[posicion[0]][posicion[1]] = valorAux;
				}
			}
		}
		return matriz;
	}

	/**
	 * Comprueba si una matriz es concéntrica.
	 * 
	 * @param matriz
	 * @return Retorna TRUE si es concéntrica o FALSE si no lo es.
	 */
	public static boolean checkConcentric(int[][] matriz) {
		for (int i = 0; i < Math.round(matriz.length / 2); i++) {
			for (int j = i; j < matriz.length - (i + 1); j++) {
				if (matriz[i][j] != matriz[i][j + 1]
						|| matriz[matriz.length - (i + 1)][j] != matriz[matriz.length - (i + 1)][j + 1]
						|| matriz[j][i] != matriz[j + 1][i]
						|| matriz[j][matriz.length - (i + 1)] != matriz[j + 1][matriz.length - (i + 1)]) {
					return false;
				}
			}
		}
		return true;
	}
}
