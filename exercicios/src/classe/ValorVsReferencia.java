package classe;

public class ValorVsReferencia {

	public static void main(String[] args) {
		double a = 3;
		double b = a; //atribuição por valor, o valor sera copiado e podendo ser alterado independente
		
		a++;
		b--;
		
		System.out.println(a + " " + b);
		
		Data d1 = new Data(1, 1, 1970);
		Data d2 = d1; //atribuição por referencia, se um for alterado, o outro tambem sera.
		
		d1.dia = 31;
		d2.mes = 12;
		d1.ano = 2025;
		
		System.out.println(d1.obterDataFormatada());
		System.out.println(d2.obterDataFormatada());
		
		voltarDataValorPadrao(d1);
		
		System.out.println(d1.obterDataFormatada());
		System.out.println(d2.obterDataFormatada());
		
		int c = 5;
		alterarPrimitivo(c); //passado valor por copia, nao consegue alterar a variavel primitiva direto
		System.out.println(c); //o mesmo valor de antes é retornado
		
		
	}
	
	static void voltarDataValorPadrao (Data d) {
		d.dia = 1;
		d.mes = 1;
		d.ano = 1970;
	}
	
	static void alterarPrimitivo (int c) {
		c++;
	}
}
