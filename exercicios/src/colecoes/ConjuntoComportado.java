package colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {

	public static void main(String[] args) {
		
		//Set<String> listaAprovados = new HashSet<>(); //<String> serve para definir o tipo que todo o conjunto vai ter
		SortedSet<String> listaAprovados = new TreeSet<>(); //organiza os conjuntos de acordo com a ordem alfabetica
		listaAprovados.add("Ana");
		listaAprovados.add("Calor");
		listaAprovados.add("Lucas");
		listaAprovados.add("Bia");
		
		for (String candidatos: listaAprovados) {
			System.out.println(candidatos);
		}
		
		Set<Integer> nums = new HashSet<>();
		nums.add(1);
		nums.add(2);
		nums.add(3);
		nums.add(4);
		
		for (Integer n : nums) {
			System.out.println(n);
		}
		
	}
}
