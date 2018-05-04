package funcao.recursivas;

public class VerificaDigito {
	public static int localiza(int n, int k, int rep) {
		if(n % 10 == k) {
			rep++;
		}
		if(n % 10 == n) {
			return rep;
		}
		return localiza(n / 10, k, rep);
	}

}
