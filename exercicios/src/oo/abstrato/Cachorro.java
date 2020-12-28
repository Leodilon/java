package oo.abstrato;

public class Cachorro extends Mamifero{ //na classe concreta, todos os metodos abstrados devem ser definidos

	@Override
	public String mover() { //o metodo embora tenha sido definido, ele pode ter sobrescrito para ser alterado
		
		return "Usando as patas";
	}
	
	@Override
	public String mamar() { 
		
		return "Usando leite";
	}
}
