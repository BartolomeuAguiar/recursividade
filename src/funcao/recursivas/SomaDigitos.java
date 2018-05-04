package funcao.recursivas;

public class SomaDigitos {
	public static int somaDigitos(int n){
		if(n < 10) return n % 10;
		return somaDigitos(n / 10) + n % 10;
	}


}
