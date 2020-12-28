package fundamentos;

public class TiposPrimitivos {

	public static void main(String[] args) {
		//Tipo numericos inteiros
		
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 542;
		int id = 56789;
		long pontosAcumulados = 3_134_845_223L; //pode usar o underline para facilitar a leitura de um numero
		
		//Tipo numericos reais
		float salario = 11_455.44F;
		double vendasAcumuladas = 2_991_987_456.01;
		
		//Tipo booleano
		boolean estaDeFerias = false; //nao pode ser 0 ou 1, tem q ser true ou false
		
		//Tipo caracter
		char status = 'A';
		
		//Dias na empresa
		System.out.println(anosDeEmpresa * 365);
		
		//Numero de viagens
		System.out.println(numeroDeVoos / 2);
		
		//Pontos por real
		System.out.println(pontosAcumulados / vendasAcumuladas);
		
		System.out.println(id + ": ganha -> " + salario);
		System.out.println("Ferias? " + estaDeFerias);
		System.out.println("Status " + status);
	
	}
}

