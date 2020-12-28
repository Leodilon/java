package arrays;

import java.util.Scanner;

public class DesafioArray {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.print("Informe a quantidade de notas para calcular a media: ");
		int quantidade = entrada.nextInt();
		
		double notas[] = new double[quantidade];
		
		for (int i = 0; i < notas.length; i++) {
			System.out.printf("Informe a nota numero %d: ", i + 1);
			notas[i] = entrada.nextDouble();
		}
		entrada.close();
		
		double total = 0;
		for (double nota : notas) {
			total += nota;
		}
		
		double media = total / notas.length;
		System.out.printf("A media das notas é: %.2f", media);
	}

}
