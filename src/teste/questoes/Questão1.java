package teste.questoes;
import funcao.recursivas.Fibonacci;

public class Questão1 {
	public static void main(String[] args) {
		int posicao = 12;
		for (int i = 1; i <= posicao; i++) {
			System.out.println(Fibonacci.fibonacci(i));
		}
	}

}
