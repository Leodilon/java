package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {
	public static void main(String[] args) {
		Deque<String> livros = new ArrayDeque<String>();
		
		livros.add("O Pequeno Principe");
		livros.push("Don Quixote");
		livros.push("O Hobbit");
		
		System.out.println();
		for (String livro : livros) {
			System.out.println(livro);
		}
		
		System.out.println();
		
		System.out.println(livros.peek());
		System.out.println(livros.element()); //pega o ultimo elemento inserido
		System.out.println(livros.remove()); //exibe e remove o elemento da pilha
		System.out.println(livros.pop()); //equivalente ao remove
		System.out.println(livros.poll()); //pega o ultimo elemento, exibe e remove da pilha
		System.out.println(livros.poll());
		System.out.println(livros.poll());
		System.out.println(livros.poll()); //retorna null se nao houver mais nada
		//System.out.println(livros.remove()); //gera exceção se nao houver nada na pilha
		//System.out.println(livros.pop()); //gera exceção se nao houver nada na pilha
	}
}
