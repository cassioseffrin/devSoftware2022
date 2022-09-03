package aulas1e2;

class Matematica implements InterfaceMatematica {

	/**
	 * Este método faz a multiplicação de 2 números
	 * 
	 * @param a
	 * @param b
	 * @return {@link Float}
	 */
	public float multiplicar(float a, float b) {
		return a * b;
	}

	/**
	 * Este método faz a divisão de 2 números
	 * 
	 * @param a
	 * @param b
	 * @return
	 */
	public float dividir(float a, float b) {
		return a / b;
	}

	/**
	 * Este método faz a soma de 2 números
	 * 
	 * @param a
	 * @param b
	 * @return
	 */
	public float somar(float a, float b) {
		return a + b;
	}

	/**
	 * Este método faz a subtração de 2 números
	 * 
	 * @param a
	 * @param b
	 * @return
	 */
	public float subtrair(float a, float b) {
		return a - b;
	}


}
