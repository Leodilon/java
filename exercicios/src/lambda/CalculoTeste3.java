package lambda;

import java.util.function.BinaryOperator;

public class CalculoTeste3 {

	public static void main(String[] args) {
		
		//java nao permite a conversão direta de int -> Double
		//java permite apenas a conversão de double -> Double
		
		BinaryOperator<Double> c1 = (x, y) -> { return x + y; }; //definida uma interface funcional do proprio java
		
		System.out.println(c1.apply(2.0, 3.0)); //é necessario colocar o valor com ponto
		
		c1 = (x, y) -> x * y; //pode ser removida as chaves e nesse caso nao se usa o return, mas com apenas uma sentença de codigo
		System.out.println(c1.apply(2.0, 3.0));
		
		BinaryOperator<Integer> c2 = (x, y) -> { return x + y; };
		
		System.out.println(c2.apply(2, 3));
		
		c1 = (x, y) -> x * y;
		System.out.println(c2.apply(2, 3));

	}
}
