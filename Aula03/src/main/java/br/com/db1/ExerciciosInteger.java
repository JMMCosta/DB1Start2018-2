package br.com.db1;

import java.util.ArrayList;
import java.util.List;

public class ExerciciosInteger {
	
	
	
	public Integer exercicioSoma(Integer numero1, Integer numero2) {
		return numero1+numero2;
		
	}
	

	public Integer exercicioSubtracao(Integer numero1, Integer numero2) {
		return numero1-numero2;
		
	}
	
	public Integer exercicioMultiplicacao(Integer numero1, Integer numero2) {
		return numero1*numero2;
		
	}
	
	public Integer exercicioDivisao(Integer numero1, Integer numero2) {
		return numero1/numero2;
		
	}

	public Boolean exercicioParidade(Integer numero) {
		return numero%2 == 0;
		
	}

	public Integer exercicioMaior(Integer numero1, Integer numero2) {
		if (numero1 > numero2){
			return numero1;
		}
		else {
			return numero2;
		}
		
	}
	
	public List<Integer> exercicioListaImpares(Integer numero) {
		
		List<Integer> listaImpares = new ArrayList<Integer>();
		
		for(Integer x = numero; x<=100; x++)
			if (x%2 != 0) {
				listaImpares.add(x);
			}
		
		
		
		for(Integer y = 0; y<= listaImpares.size(); y++) {
			
			System.out.println(listaImpares.get(y));		
			
		}
		
		
			
		return listaImpares;
		
	}

	
	}
