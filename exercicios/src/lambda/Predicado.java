package lambda;

import java.util.function.Predicate;

public class Predicado {
	
	public static void main(String[] args) {
		
		Predicate<Produto> isCaro = 
				prod -> (prod.preco * (1 - prod.desconto)) >= 750; //recebe um tipo de daos, executa a fun��o e retorna um boolean
		
		Produto produto = new Produto("Notebook", 3875.45, 0.15);
		System.out.println(isCaro.test(produto)); //testa se o pre�o do produto � caro de acordo com o parametro
	}

}
