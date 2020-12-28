package lambda;

public class CalculoTeste1 {

	public static void main(String[] args) {
		
		//metodo tradicional criando classes
		
		Calculo c1 = new Somar();
		System.out.println(c1.executar(2, 3));
		
		c1 = new Multiplicar();
		System.out.println(c1.executar(2, 3));
	}
}
