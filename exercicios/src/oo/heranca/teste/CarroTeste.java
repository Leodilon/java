package oo.heranca.teste;

import oo.heranca.desafio.Carro;
import oo.heranca.desafio.Civic;
import oo.heranca.desafio.Ferrari;

public class CarroTeste {

	public static void main(String[] args) {
		Carro c1 = new Civic(160);
		Ferrari c2 = new Ferrari(250);
		
		System.out.println(c1.delta);
		System.out.println(c2.delta);
		
		System.out.println("A velocidade do Civic é: " + c1.velocidadeAtual);
		System.out.println("A velocidade da Ferrari é: " + c2.velocidadeAtual);
		System.out.println();
		
		
		c2.ligarTurbo();
		c1.acelerar();
		c2.acelerar();
	
		
		System.out.println("A velocidade do Civic é: " + c1.velocidadeAtual);
		System.out.println("A velocidade da Ferrari é: " + c2.velocidadeAtual);
		System.out.println();
		
		c1.frear();
		c1.frear();
		c1.frear();
		c1.frear();
		c2.frear();
		c2.frear();
		c2.frear();
		c2.frear();
		c2.frear();
		c2.frear();
		c2.frear();
		c2.frear();
		
		System.out.println("A velocidade do Civic é: " + c1.velocidadeAtual);
		System.out.println("A velocidade da Ferrari é: " + c2.velocidadeAtual);
		System.out.println();
	}
}
