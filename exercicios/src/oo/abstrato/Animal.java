package oo.abstrato;

public abstract class Animal { //classe abstrata nao pode ser instanciada

	public String respirar() {
		return "Usando Oxigenio";
	}
	
	public abstract String mover(); //classe pode possuir metodos nao definidos que serão completados nas subclasses
}
