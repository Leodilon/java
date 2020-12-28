package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {
		Queue<String> fila = new LinkedList<String>();
		
		//Offer e Add -> adicionam elementos na fila
		//a diferença ocorre quando a fila esta cheia
		fila.add("Ana"); //retorna false
		fila.offer("Bia"); //gera uma exceção
		fila.add("Carlos");
		fila.offer("Daniel");
		fila.add("Rafaela");
		fila.offer("Gui");
		
		//Peek e Element -> obter o próximo elemento da fila, sem remover
		//diferença o corre quando a fila esta vazia
		System.out.println(fila.peek()); //retorna o primeiro item da lista
		System.out.println(fila.peek()); //se nao houver nada, retorna null
		System.out.println(fila.element()); //retorna o primeiro item da lista
		System.out.println(fila.element()); //se nao houver nada, lança uma exceção
		
//		fila.size(); //retorna o tamanho
//		fila.isEmpty(); //verifica se a fila esta vazia ou nao
//		fila.clear(); //limpa a fila
		
		System.out.println();
		System.out.println(fila.poll()); //exibe o primeiro item e remove ele da fila
		System.out.println(fila.remove()); //exibe o primeiro item e remove ele da fila
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll()); //pode ser chamado varias vezes, quando a fila acaba, retorna null
//		System.out.println(fila.remove()); // quando a fila acaba, lança uma exceção
		
	}
}
