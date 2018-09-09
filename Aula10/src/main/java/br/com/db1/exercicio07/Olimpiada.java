package br.com.db1.exercicio07;

import java.util.List;

public class Olimpiada {
	private Integer ano;
	private List<Modalidade> listaModalidades;
	private Sede sede;
	private List<Atleta> listaAtletas;
	private List<Voluntario> listaVoluntario;
	private List<Juiz> listaJuiz;
	
	
	public Olimpiada(List listaJuiz,List listaVoluntario, List listaAtletas, List listaModalidades, Sede sede ) {

	}


	public Integer getAno() {
		return ano;
	}


	public void setAno(Integer ano) {
		this.ano = ano;
	}
	
	

}
