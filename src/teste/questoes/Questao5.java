package teste.questoes;

import funcao.recursivas.IsPalindromo;

public class Questao5 {
	public static void main(String[] args) {
		String palindromo = "ana";
		String naoPalindromo = "rosa";

		System.out.println(
				palindromo + " eh palindromo? " + IsPalindromo.isPalindromo(palindromo, palindromo.length(), -1));
		System.out.println(naoPalindromo + " eh palindromo? "
				+ IsPalindromo.isPalindromo(naoPalindromo, 0, naoPalindromo.length() - 1));
	}
}
