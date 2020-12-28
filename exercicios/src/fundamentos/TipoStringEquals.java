package fundamentos;

import java.util.Scanner;

public class TipoStringEquals {

	public static void main(String[] args) {
		System.out.println("2" == "2");
		
		String s1 = new String("2");
		System.out.println("2" == s1); //compara��o direta pode retornar erros
		System.out.println("2".equals(s1)); //compara��o de strings utilizando equals
		
		Scanner entrada = new Scanner(System.in);
		
		String s2 = entrada.nextLine(); //nextLine() nao remove os espa�os em branco, o next() remove
		System.out.println("2" == s2);
		System.out.println("2".equals(s2.trim())); //trim remove os espa�os em branco
		
		entrada.close();
	}

}
