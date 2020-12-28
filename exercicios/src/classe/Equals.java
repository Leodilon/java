package classe;

public class Equals {

	public static void main(String[] args) {
		Usuario u1 = new Usuario();
		u1.nome = "Pedro Silva";
		u1.email = "pedro.silva@email.com";
		
		Usuario u2 = new Usuario();
		u2.nome = "Pedro Silva";
		u2.email = "pedro.silva@email.com";
		
		System.out.println(u1 == u2); //retorna falso pois � comparado apenas o endere�vo de memoria, cada objeto ocupa um endere�o de memoria diferente
		System.out.println(u1.equals(u2)); //retorna verdadeiro apenas se o metodo equals for definido na classe do objeto
		System.out.println(u1.equals(u2));
	}
}
