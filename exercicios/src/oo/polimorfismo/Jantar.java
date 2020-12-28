package oo.polimorfismo;

public class Jantar {

	public static void main(String[] args) {

		Pessoa p1 = new Pessoa(99.65);
		
		Comida arroz = new Arroz(0.2);
		Comida feijao = new Feijao(0.1);
		
		System.out.println(p1.getPeso());
		
		p1.comer(arroz);
		p1.comer(feijao);

		System.out.println(p1.getPeso());
		
		Comida sorvete = new Sorvete(0.4);
		
		p1.comer(sorvete);
		
		System.out.println(p1.getPeso());
	}

}
