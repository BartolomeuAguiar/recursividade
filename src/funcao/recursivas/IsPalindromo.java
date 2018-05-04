package funcao.recursivas;

public class IsPalindromo {
	public static boolean isPalindromo(String palavra, int i, int j) {
	    if (i >= j) {
	        return true;
	    } else {
	        boolean iguais = palavra.charAt(i) == palavra.charAt(j);
	        return iguais && (j - i == 1 ? true : isPalindromo(palavra, i + 1, j - 1));
	    }
	}

}
