package excecao;

public class ChecadaVsNaoChecada {

	public static void main(String[] args) {
		
		gerarErro1();
		gerarErro2();
	}
	
	static void gerarErro1() {
		throw new RuntimeException("Ocorreu o erro #1!"); //o erro s� � lan�ado se possuir a palavra throw
	}
	
	static void gerarErro2() {
		new Exception("Ocorreu o erro #2!"); //sem a palavra throw, ele � gerado, mas nada acontece
	}
}
