package fundamentos.operadores;

public class DesafioAritimetico {

	public static void main(String[] args) {
		
		int a = 3 * 4 - 10;
		int b = (int) Math.pow(a, 3);
		
		System.out.println(b);
		
		int c = ((int) Math.pow((6 * (3 + 2)), 2) / (3*2));
		int d = (int) Math.pow((((1 - 5) * (2-7)) / 2 ), 2);
		int e = (int) Math.pow(c - d, 3);
		int f = e / (int) Math.pow(10, 3);
		System.out.println(f);
		
	}
}
