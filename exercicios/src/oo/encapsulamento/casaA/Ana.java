package oo.encapsulamento.casaA;

public class Ana {

	@SuppressWarnings("unused")
	private String segredo = "..."; //apenas a propria classe tem aceso
	String facoDentroDeCasa = "..."; //apenas classes dentro do mesmo pacote tem acesso
	protected String formaDeFalar = "..."; //classes dentro do mesmo pacote e classes q recebem de herança
	public String facoNaRua = "..."; //pode ser acessado de qualquer lugar
}
