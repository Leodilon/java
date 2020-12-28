package lambda;

@FunctionalInterface
public interface Calculo {

	public double executar(double a, double b); //em uma interface funcional, s� � possivel ter um unico metodo de interface para ser definido
	
	default String legal() { //� possivel utilizar metodo default
		return "Legal";
	}
	
	static String muitoLegal() { //� possivel utilizar metodo statico
		return "Muito Legal";
	}
}
