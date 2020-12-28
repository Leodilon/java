package oo.abstrato;

public abstract class Mamifero extends Animal{

	public abstract String mamar();
	
	@Override
	public String mover() { //um metodo abstrado da super classe pode ou nao ser definido na classe que herda
		
		return "Saindo do lugar";
	}
}
