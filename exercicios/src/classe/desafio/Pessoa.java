package classe.desafio;

public class Pessoa {
	String nome;
	double peso;
	
	Pessoa(String nome, double peso) {
		this.nome = nome;
		this.peso = peso;
	}
	
	double Comer(Comida c) {
		this.peso += c.pesoComida;
		return this.peso;
		
	}
}
