package streams;

import java.util.Arrays;
import java.util.List;

public class Outros {

	public static void main(String[] args) {
		
		Aluno a1 = new Aluno("Ana", 7.1);
		Aluno a2 = new Aluno("Luna", 6.1);
		Aluno a3 = new Aluno("Gui", 8.1);
		Aluno a4 = new Aluno("Gabi", 10.0);
		Aluno a5 = new Aluno("Ana", 7.1);
		Aluno a6 = new Aluno("Pedro", 6.1);
		Aluno a7 = new Aluno("Gui", 8.1);
		Aluno a8 = new Aluno("Maria", 10.0);
		
		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6, a7, a8);
		
		System.out.println("Distinct..."); //exibe apenas resultados diferentes
		alunos.stream().distinct().forEach(System.out::println);
		
		System.out.println("\nSkip / Limit"); //pula e limita o resultado
		alunos.stream()
			.distinct()
			.skip(2) //puta a quantidade indicada dos retornos
			.limit(2) //limita quantos retornos ser�o exibidos
			.forEach(System.out::println);
		
		System.out.println("\ntakeWhile"); //fa�a algo at� q a condi��o seja falsa
		alunos.stream()
			.distinct()
			.takeWhile(a -> a.nota >= 7)
			.forEach(System.out::println);

		
	}
}