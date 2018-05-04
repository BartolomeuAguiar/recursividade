package funcao.recursivas;

public class PrintNumbers {
	public static int retNaturais(int n) {
		if (n == 0) {
			return 0;
		} else {
			System.out.println(n);
			return retNaturais(n-1);
		}
	}
}
