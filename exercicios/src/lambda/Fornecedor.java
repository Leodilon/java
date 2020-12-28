package lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class Fornecedor {

	public static void main(String[] args) {
		
		//nao recebe nada mas retorna um determinado valor
		Supplier< List<String> > umaLista = () -> Arrays.asList("Ana", "Bia", "Lia", "Gui");
		
		//nao pode ser feito composiçoes
		System.out.println(umaLista.get());
	}
}
