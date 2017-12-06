package Integer;

public class Integer {
	/**
	 * Genera un número aleatorio entre un mínimo y un máximo
	 * 
	 * @param max
	 *            Valor máximo.
	 * @param min
	 *            Valor mínimo.
	 * @return Retorna un valor.
	 */
	public static int generateRandomNumber(int max, int min) {
		return (int) (Math.random() * (max - min + 1)) + min;
	}
}
