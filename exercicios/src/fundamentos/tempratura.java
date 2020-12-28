package fundamentos;

public class tempratura {

	public static void main(String[] args) {
		double f = 86;
		final int AJUSTE = 32;
		final double FATOR = 5.0/9.0;
		double c;
		
		c = (f - AJUSTE) * FATOR;
		
		System.out.println(c);
	}

}
