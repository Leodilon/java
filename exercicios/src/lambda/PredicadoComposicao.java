package lambda;

import java.util.function.Predicate;

public class PredicadoComposicao {

	public static void main(String[] args) {
		
		Predicate<Integer> isPar = num -> num % 2 == 0;
		Predicate<Integer> isTresDigitos = num -> num >= 100 && num <= 999;
		
		System.out.println(isPar.test(122)); //testa se � par
		System.out.println(isPar.and(isTresDigitos).test(122)); //composi��o entre as 2 fun�oes utilizando o AND
		System.out.println(isPar.and(isTresDigitos).test(123));
		System.out.println(isPar.and(isTresDigitos).negate().test(123));
		System.out.println(isPar.or(isTresDigitos).test(123)); //composi��o entre as 2 fun�oes utilizando o OR
		System.out.println(isPar.or(isTresDigitos).test(22));
	}
}
