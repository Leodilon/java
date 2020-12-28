package classe.desafio;

public class Jantar {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa("Ze", 80.5);
		Pessoa p2 = new Pessoa("Maria", 45.7);
		
		Comida c1 = new Comida("Arroz", 0.2);
		Comida c2 = new Comida("Feijao", 0.15);
		
		System.out.printf("A pessoa %s pesa %.2f", p1.nome, p1.peso);
		System.out.printf("\nA pessoa %s pesa %.2f", p2.nome, p2.peso);
		
		p1.Comer(c1);
		p1.Comer(c2);
		p2.Comer(c1);
		p2.Comer(c2);
		
		System.out.printf("\n\nA pessoa %s depois de comer pesa %.2f", p1.nome, p1.peso);
		System.out.printf("\nA pessoa %s depois de comer pesa %.2f", p2.nome, p2.peso);
	}

}
