package br.com.db1;

import java.util.List;


public class ExerciciosString {
	
	public String exercicioMaiuscula(String texto) {
		
		return texto.toUpperCase();
	}
	
	public String exercicioMinuscula(String texto) {
		
		return texto.toLowerCase();
	}

	
	public Integer exercicioTamanho() {
		String texto = "DB1START"; 
		
		return texto.length();
	}
	
	
	public Integer exercicioTamanhoComEspacos() {
		String texto = " DB1START "; 
		
		return texto.length();
	}
	

	public Integer exercicioTamanhoSemEspacos() {
		String texto = " DB1START "; 
		
		return texto.trim().length();
	}
	
	
	public String exercicioNomeCurtoComeco(String nomeCompleto) {
		
		return nomeCompleto.substring(0, 3);
	}
	
	
	public String exercicioNomeTerceiroCaractere(String nomeCompleto) {
		
		return nomeCompleto.substring(2);
	}
	
	
	public String exercicioNomeCurtoFim(String nomeCompleto) {
		
		return nomeCompleto.substring(nomeCompleto.length() - 4);
	}
	
	
	public String exercicioNomeSubistituicao(String nomeCompleto) {
		
		String[] str = nomeCompleto.split(" ", 2);
		
		str[0] = "ALUNO";
		
		String novoNome = str[0] + " " + str[1];
		
		return novoNome;	
	}
	
	
	public Integer exercicioFrutas(String frutas) {
		
		String[] frutasSeparadas = frutas.split(",");
		
		for(Integer contador = 0; contador < frutasSeparadas.length; contador ++) {
			
			System.out.println(frutasSeparadas[contador]);
		}
		
		return frutasSeparadas.length;
				
	}
	
	
	public Integer exercicioVogais(String texto) {
		
		Integer quantidade = 0;
		
		for(Integer contador = 0; contador < texto.length(); contador ++) {
			Character letra = texto.toLowerCase().charAt(contador);
			if ((letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra =='u' )) {
				quantidade++;
				
			}
		}
		
		return quantidade;
						
	}
	
	public String exercicioInvertido(String texto) {
		
		String textoinvertido = "";
		
		for(Integer contador = texto.length() - 1; contador >= 0; contador--) {
			textoinvertido = textoinvertido + texto.charAt(contador);			
		}
		
		return textoinvertido;
	}
	
	
	
}


