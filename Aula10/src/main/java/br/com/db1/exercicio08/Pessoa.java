package br.com.db1.exercicio08;

import java.util.Date;
import java.util.List;

public abstract class Pessoa {
	
	private String nome;
	private Date dataNascimento;
	private List<Endereco> listaEndereco;
	private List<Telefone> listatelefone;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Date getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public List<Endereco> getListaEndereco() {
		return listaEndereco;
	}
	public void setListaEndereco(List<Endereco> listaEndereco) {
		this.listaEndereco = listaEndereco;
	}
	public List<Telefone> getListatelefone() {
		return listatelefone;
	}
	public void setListatelefone(List<Telefone> listatelefone) {
		this.listatelefone = listatelefone;
	}
	
	

	}
	

