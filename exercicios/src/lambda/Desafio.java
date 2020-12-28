package lambda;

import java.util.Locale;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Desafio {

	public static void main(String[] args) {
		
		Produto p = new Produto("iPad", 3235.89, 0.13);
		
		Function<Produto, Double> precoFinal = produto -> produto.preco * (1 - produto.desconto);
		UnaryOperator<Double> imposto = valor -> valor >= 2500 ? valor * 1.085 : valor;
		UnaryOperator<Double> frete = valor -> valor >= 3000 ? valor + 100 : valor + 50;
		UnaryOperator<Double> arredondar = preco -> Double.parseDouble(String.format(Locale.ENGLISH, "%.2f", preco));
		Function<Double, String> formatar = valor -> ("R$" + valor).replace(".", ",");
		
		
		String preco = precoFinal
				.andThen(imposto)
				.andThen(frete)
				.andThen(arredondar)
				.andThen(formatar)
				.apply(p);
		
		System.out.println("O pre�o final �: " + preco);
	}
}
