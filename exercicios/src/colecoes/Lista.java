package colecoes;

import java.util.ArrayList;

public class Lista {

	public static void main(String[] args) {

		ArrayList<Usuario> lista = new ArrayList<>();
		
		Usuario u1 = new Usuario("Ana");
		
		lista.add(u1);
		lista.add(new Usuario("Carlos")); //adiciona objeto a lista
		lista.add(new Usuario("Lia"));
		lista.add(new Usuario("Bia"));
		lista.add(new Usuario("Manu"));
		
		System.out.println(lista.get(3)); //retorna o valor pelo indice
		
		System.out.println(">>>>> " + lista.remove(1)); //exibe o valor e remove da lista, utilizando o indice
		System.out.println("+++++ " + lista.remove(new Usuario("Lia"))); //retorna apenas true ou false caso o objeto tenha sido removido
		System.out.println("Tem?? " + lista.contains(new Usuario("Manu"))); //retorna se o objeto existe na lista
		
		System.out.println();
		for (Usuario u: lista) {
			System.out.println(u.nome);
		}
	}

}
