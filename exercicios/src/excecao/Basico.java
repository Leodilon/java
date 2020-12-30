package excecao;

public class Basico {

	public static void main(String[] args) {
		
		Aluno a1 = null;
		
		try {
			imprimirNome(a1); //aluno nao foi definido, impossivel mostrar o nome
		} catch (Exception e) {
			
			System.out.println("Nome do aluno nao definido"); //tratamento de erro
		}
		
		try {
			System.out.println(7 / 0); //impossivel dividir por zero
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
		}
		
		System.out.println("Fim !!!!"); //sem o tratamento de erro, caso de problema, o restante nao é executado
		
	}
	
	public static void imprimirNome(Aluno aluno) {
		System.out.println(aluno.nome);
	}
}
