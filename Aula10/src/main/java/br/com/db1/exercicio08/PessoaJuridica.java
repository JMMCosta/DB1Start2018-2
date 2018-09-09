package br.com.db1.exercicio08;

public class PessoaJuridica extends Pessoa {
	
	private Integer cnpj;

	public Integer getCnpj() {
		return cnpj;
	}

	public void setCnpj(Integer cnpj) {
		this.cnpj = cnpj;
	}
	
	
	public Boolean validarCnpj() {
		return null;
	}
	
	public String formatarCnpj() {
		return null;
	}

}
