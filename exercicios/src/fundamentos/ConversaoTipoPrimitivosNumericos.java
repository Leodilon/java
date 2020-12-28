package fundamentos;

public class ConversaoTipoPrimitivosNumericos {

	public static void main(String[] args) {
		
		double a = 1; //comversão implicita
		System.out.println(a);
		
		float b = (float) 1.123456789; //convrsão explicita, precisa ser informada a conversão
		System.out.println(b);
		
		int c = 340;
		byte d = (byte) c; //conversao explicita, nesse caso existe perda de informação pq os tipo tem tamanhos diferentes
		System.out.println(c);
		System.out.println(d);
		
		double e = 1.9999999;
		int f = (int) e;
		System.out.println(e);
		System.out.println(f);
	}
}
