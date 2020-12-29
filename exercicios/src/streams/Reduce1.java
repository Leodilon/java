package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class Reduce1 {

	public static void main(String[] args) {
		
		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		
		BinaryOperator<Integer> soma = (ac, n) -> ac + n;
		
		Integer total1 = nums.parallelStream().reduce(soma).get();
		System.out.println(total1);
		
		Integer total2 = nums.stream().reduce(100, soma); //o valor 100 foi adicionado como ponto inicial
		System.out.println(total2);
		
		nums.stream().filter(n -> n > 5).reduce(soma).ifPresent(System.out::print);
	}
}
