package classe;

public class ProdutoTeste {

	public static void main(String[] args) {
		Produto p1 = new Produto("Notebook", 4325);
		
		var p2 = new Produto();
		p2.nome = "Caneta";
		p2.preco = 12.56;
		
		Produto.desconto = 0.35; //desconto aplicado em todos os produtos
		
		double precoFinal1 = p1.precoComDesconto();
		double precoFinal2 = p2.precoComDesconto();
		double mediaCarrinho = (precoFinal1 + precoFinal2) / 2;
		
		System.out.println(precoFinal1);
		System.out.printf("Media do carrinho: R$%.2f", mediaCarrinho);
		
	}
}
