package oo.encapsulamento.casaA;

public class Paulo {

	Ana esposa = new Ana();
	
	void testarAcesso() {
		
		//System.out.println(esposa.segredo); //nao consegue acessar
		System.out.println(esposa.facoDentroDeCasa);
		System.out.println(esposa.formaDeFalar);
		System.out.println(esposa.facoNaRua);
				
	}
}
