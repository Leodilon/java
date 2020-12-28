package fundamentos.operadores;

public class Operadores {

	public static void main(String[] args) {

		boolean condicao1 = true;
		boolean condicao2 = 3 > 7;
		
		System.out.println(condicao1 && condicao2); //operador E (AND)
		System.out.println(condicao1 && !condicao2); 
		System.out.println(condicao1 || condicao2); //operador OU (OR)
		System.out.println(condicao1 ^ condicao2); //operador OU EXCLUSIVO (XOR)
		System.out.println(!condicao1); //NEGACAO
		System.out.println(!!condicao1);
		System.out.println(!condicao2);
	}

}
