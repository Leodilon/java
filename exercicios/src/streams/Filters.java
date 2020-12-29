package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Filters {

	public static void main(String[] args) {
		
		Aluno a1 = new Aluno("Ana", 8.9);
		Aluno a2 = new Aluno("Pedro", 6.2);
		Aluno a3 = new Aluno("Rebeca", 9.5);
		Aluno a4 = new Aluno("Gui", 8.1);
		Aluno a5 = new Aluno("Julia", 9.0);
		Aluno a6 = new Aluno("Bia", 6.7);
		
		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6);
		
		Predicate<Aluno> aprovado = a -> a.nota >= 7;
		Function<Aluno, String> parabens = a -> "Parabens " + a.nome + ", voce foi aprovado(a)!!";
		
		alunos.stream().filter(aprovado).map(parabens).forEach(System.out::println);
	}
}
