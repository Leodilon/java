package fundamentos;

public class TipoString {
	
	public static void main(String[] args) {
		System.out.println("Ola pessoal".charAt(2));
		
		String s = "Boa tarde";
		System.out.println(s.concat("!!!"));
		System.out.println(s + "!!!");
		System.out.println(s.startsWith("Boa"));
		System.out.println(s.toLowerCase().startsWith("boa"));
		System.out.println(s.toUpperCase().endsWith("TARDE"));
		System.out.println(s.length());
		System.out.println(s.equals("boa tarde")); //compara e nao ignora letras maiusculas
		System.out.println(s.equalsIgnoreCase("boa tarde")); //ignora letra maiuscula
		
		var nome = "Pedro";
		var sobrenome = "Santos";
		var idade = 33;
		var salario = 12345.9798;
		
		String maisUmaString = "\nNome: " + nome + "\nSobrenome: " + sobrenome + "\nIdade" + idade + "\nSalario: " + salario;
		System.out.println(maisUmaString);
		
		System.out.printf("\nO senhor %s %s tem %d anos e ganhar R$ %.2f", nome, sobrenome, idade, salario);
		String frase = String.format("\nO senhor %s %s tem %d anos e ganhar R$ %.2f", nome, sobrenome, idade, salario);
		System.out.println(frase);
	}
}
