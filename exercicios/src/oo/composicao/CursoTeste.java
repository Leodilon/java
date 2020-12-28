package oo.composicao;

public class CursoTeste {

	public static void main(String[] args) {
		Aluno aluno1 = new Aluno("Pedro");
		Aluno aluno2 = new Aluno("Maria");
		Aluno aluno3 = new Aluno("João");
		
		Curso curso1 = new Curso("Java");
		Curso curso2 = new Curso("PHP");
		Curso curso3 = new Curso("Phyton");
		
		curso1.adicionarAluno(aluno1);
		curso1.adicionarAluno(aluno2);
		
		curso2.adicionarAluno(aluno2);
		curso2.adicionarAluno(aluno3);
		
		aluno1.adicionarCurso(curso3);
		aluno2.adicionarCurso(curso3);
		aluno3.adicionarCurso(curso3);
		
		for (Aluno aluno : curso3.alunos) {
			System.out.printf("Meu nome é %s e estou matriculado no curso %s\n", aluno.nome, curso3.nome);
		}		
		
		Curso cursoEncontrado = aluno1.obterCursoPorNome("Java");
		
		if(cursoEncontrado != null) {
			System.out.println(cursoEncontrado.nome);
			System.out.println(cursoEncontrado.alunos);
		}
	}
}
