package newpackage;

public class Utilidad {

	public int ejercicioD(int a) {
		return (a == 0) ? 0 : a + factorial(a);
	}

	public int factorial(int n) {
		if (n == 1) {
			return 1;
		} else {
			return n * factorial(n - 1);
		}
	}

	public boolean refactorizacionD(int a, int b) {
		// Calculo único
		int c = a + b;
		// Calculo único
		int d = c + 34;

		// Calculo si d es primo
		boolean esPrimo = true;
		for (int i = 2; i < d; i++) {
			if (d % i == 0) {
				esPrimo = false;
			}
		}

		boolean resultado = !esPrimo;
		return (resultado);
	}

}
