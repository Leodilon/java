package lambda;

import java.util.function.Function;

public class Funcoes {

	public static void main(String[] args) {
		
		//recebe um tipo de dado na entrada e retorna outro tipo de dado
		Function<Integer, String> parOuImpar = numero -> numero % 2 == 0 ? "Par" : "Impar"; //recebe um inteiro e retorna a string
		
		System.out.println(parOuImpar.apply(33));
		System.out.println(parOuImpar.apply(32));
		
		Function<String, String> oResultadoE = valor -> "O resultado é: " + valor; //pode ser criado varias pequenas funçoes
		
		Function<String, String> empolgado = valor -> valor + "!!!";
		
		//juntar pequenas função onde a saida de uma é a entrada da proxima, formando assim o processamento mais complexo
		String resultadoFinal = parOuImpar
				.andThen(oResultadoE)
				.andThen(empolgado)
				.apply(32);
		
		System.out.println(resultadoFinal);
	}
}
