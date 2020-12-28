package fundamentos;

import java.util.Scanner;

public class TipoStringEquals {

	public static void main(String[] args) {
		System.out.println("2" == "2");
		
		String s1 = new String("2");
		System.out.println("2" == s1); //comparação direta pode retornar erros
		System.out.println("2".equals(s1)); //comparação de strings utilizando equals
		
		Scanner entrada = new Scanner(System.in);
		
		String s2 = entrada.nextLine(); //nextLine() nao remove os espaços em branco, o next() remove
		System.out.println("2" == s2);
		System.out.println("2".equals(s2.trim())); //trim remove os espaços em branco
		
		entrada.close();
	}

}
