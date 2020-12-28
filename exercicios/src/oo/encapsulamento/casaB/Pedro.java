package oo.encapsulamento.casaB;

import oo.encapsulamento.casaA.Ana;

public class Pedro extends Ana{

	Ana mae = new Ana();
	
	void testarAcesso() {
					
		//System.out.println(mae.segredo); //nao consegue acessar
		//System.out.println(mae.facoDentroDeCasa); //nao consegue acessar pois é visível apenas dentro do mesmo pacote
		System.out.println(formaDeFalar); //só consegue acessar por herança, nao a partir de um objeto do tipo da super classe
//		System.out.println(mae.formaDeFalar);
		System.out.println(mae.facoNaRua);
			
	}
}
