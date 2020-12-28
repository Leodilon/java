package oo.heranca.desafio;

public class Ferrari extends Carro implements Esportivo, Luxo{

	public Ferrari(int velocidadeMaxima) {
		super(velocidadeMaxima);
		this.delta = 15;
	}
	
	@Override
	public void ligarTurbo() {
		this.delta = 35;
	}
	
	@Override
	public void desligarTurbo() {
	}
	
	@Override
	public void ligarAr() {
	}
	
	@Override
	public void desligarAr() {
	}
	
}
