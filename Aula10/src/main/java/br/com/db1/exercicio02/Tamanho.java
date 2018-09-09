package br.com.db1.exercicio02;

public enum Tamanho {
	P("P"),
	M("M"),
	G("G");
	
	private String tamanho;
	
	private Tamanho(String tamanhoParametro) {
		tamanho = tamanhoParametro;
		
	}
	
	public String getTamanho(){
		return tamanho;
	}
	

	
}
