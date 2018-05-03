package funcao.recursivas;

public class InverteNumero {
	
	public static int inverte(int n, int total) {
		if (n==0) {
			return total;
		}else {
			return inverte(n/10, total * 10+ n%10);
		}
	}
}
