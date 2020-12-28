package lambda;

@FunctionalInterface
public interface Calculo {

	public double executar(double a, double b); //em uma interface funcional, só é possivel ter um unico metodo de interface para ser definido
	
	default String legal() { //é possivel utilizar metodo default
		return "Legal";
	}
	
	static String muitoLegal() { //é possivel utilizar metodo statico
		return "Muito Legal";
	}
}
