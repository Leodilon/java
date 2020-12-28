package colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {

	@SuppressWarnings({ "rawtypes", "unchecked" }) //suprime os erros apenas nesse local
	public static void main(String[] args) {

		HashSet conjunto = new HashSet();
		
		conjunto.add(1.2);
		conjunto.add(true);
		conjunto.add("Teste");
		conjunto.add(1);
		conjunto.add('x');
		
		System.out.println("Tamanho da começão é: " + conjunto.size()); //retorna o tamanho do conjunto
		
		conjunto.add(1);
		conjunto.add('x');
		
		System.out.println("Tamanho da começão é: " + conjunto.size()); //conjunto tipo set nao aceita repetição, retorna o mesmo valor que antes
		
		System.out.println(conjunto.remove("teste"));
		System.out.println(conjunto.remove("Teste")); //caso o valor seja encontrado, sera removido da coleção
		System.out.println(conjunto.remove('x'));
		
		System.out.println("Tamanho da começão é: " + conjunto.size()); //novo tamanho sem os valores que foram removidos
		
		System.out.println(conjunto.contains('x')); //se o valor foi removido anteriormente, nao sera exibido, retorna false
		System.out.println(conjunto.contains(1));
		//System.out.println(conjunto); //exibe a coleção toda
		
		Set nums = new HashSet();
		nums.add(1);
		nums.add(2);
		nums.add(3);
		
		System.out.println(nums);
		System.out.println(conjunto);
		
		//conjunto.addAll(nums); //união entre conjuntos
		//conjunto.retainAll(nums); //apenas os valores comuns entre os 2 conjuntos sera mantido
		System.out.println(conjunto);
		
		conjunto.clear(); //limpa todo o conjunto
		System.out.println(conjunto);
	}

}
