package lambda;

public class CalculoTeste2 {

	public static void main(String[] args) {
		
		//metodo lambda, bem reduzido
		
		Calculo c1 = (x, y) -> { return x + y; };
		
		System.out.println(c1.executar(2, 3));
		
		c1 = (x, y) -> x * y; //pode ser removida as chaves e nesse caso nao se usa o return, mas com apenas uma sentença de codigo
		System.out.println(c1.executar(2, 3));
		
		System.out.println(c1.legal()); //chamada do metodo defallt
		System.out.println(Calculo.muitoLegal()); //chamada do metodo static
	}
}
