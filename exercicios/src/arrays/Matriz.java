package arrays;

import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Quantos alunos? ");
		int qtdeAlunos = entrada.nextInt();
		System.out.print("Quantas notas por aluno? ");
		int qtdeNotas = entrada.nextInt();
		
		double[][] notasTurma = new double[qtdeAlunos][qtdeNotas];
		
		double total = 0;
		for (int a = 0; a < notasTurma.length; a++) {
			for (int n = 0; n < notasTurma[a].length; n++) {
				System.out.printf("Informe a nota %d do aluno %d ", n + 1, a + 1);
				notasTurma[a][n] = entrada.nextDouble();
				total += notasTurma[a][n];
			}
		}
		entrada.close();
		
		double media = total / (qtdeAlunos * qtdeNotas);
		System.out.printf("A media da turma �: %.2f", media);
		
	}

}
