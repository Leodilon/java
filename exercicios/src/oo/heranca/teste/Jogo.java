package oo.heranca.teste;

import oo.heranca.Direcao;
import oo.heranca.Heroi;
import oo.heranca.Monstro;

public class Jogo {

	public static void main(String[] args) {
		Monstro monstro = new Monstro();
		monstro.x = 10;
		monstro.y = 10;
		
		Heroi heroi = new Heroi(10, 10);
		
		System.out.println("Monstro tem -> " + monstro.vida + " de vida");
		System.out.println("Heroi tem -> " + heroi.vida + " de vida");
		
		monstro.atacar(heroi);
		heroi.atacar(monstro);
		
		monstro.atacar(heroi);
		heroi.atacar(monstro);
		monstro.andar(Direcao.NORTE);
		monstro.atacar(heroi);
		heroi.atacar(monstro);
		
		System.out.println();
		System.out.println("Monstro tem -> " + monstro.vida + " de vida");
		System.out.println("Heroi tem -> " + heroi.vida + " de vida");
	}
	
}