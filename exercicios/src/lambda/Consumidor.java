package lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {

	public static void main(String[] args) {
		
		//recebe um tipo de dado e nao retorna nada, apenas executa a função
		Consumer<Produto> imprimir = 
				p -> System.out.println(p.nome + "!!"); //a função foi definida para retornar o nome do produto
		
		Produto p1 = new Produto("Caneta", 12.5, 0.09);
		imprimir.accept(p1);

		Produto p2 = new Produto("Notebook", 2985.5, 0.25);
		Produto p3 = new Produto("Caderno", 19.5, 0.09);
		Produto p4 = new Produto("Borracha", 6.45, 0.13);
		Produto p5 = new Produto("Lapis", 3.5, 0.19);
		
		List<Produto> produtos = Arrays.asList(p1, p2, p3, p4, p5);
		
		produtos.forEach(imprimir);
		produtos.forEach(p -> System.out.println(p.preco));
		produtos.forEach(System.out::println);
	}
}
