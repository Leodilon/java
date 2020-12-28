package oo.encapsulamento.casaB;

import oo.encapsulamento.casaA.Ana;

public class Julia {

	Ana sogra = new Ana();
	
	void testarAcesso() {
		
		//System.out.println(esposa.segredo); //nao consegue acessar
		//System.out.println(sogra.facoDentroDeCasa); //nao consegue acessar, apenas mesmo pacote
		//System.out.println(sogra.formaDeFalar); //nao recebe por herança, nao consegue acessar
		System.out.println(sogra.facoNaRua); //apenas ítens publico
				
	}
}
