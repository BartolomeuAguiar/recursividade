package funcao.recursivas;

public class Fibonacci {
	public static int fibonacci(int n) {
		if (n == 1 || n == 2) {
			return 1;
		} else {
			return fibonacci(n - 1) + fibonacci(n - 2);
		}
	}// fim do metodo fibonnaci
}// fim da classe
