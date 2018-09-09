package br.com.db1.exercicio08;

public class Endereco {
	
	private String logradouro;
	private Integer CEP;
	private TipoLogradouro tipoLogradouro;
	
	
	
	public String exibirCepFormatado() {
		return null;
	}
	
	public String getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	public Integer getCEP() {
		return CEP;
	}
	public void setCEP(Integer cEP) {
		CEP = cEP;
	}
	public TipoLogradouro getTipoLogradouro() {
		return tipoLogradouro;
	}
	public void setTipoLogradouro(TipoLogradouro tipoLogradouro) {
		this.tipoLogradouro = tipoLogradouro;
	}
	
	
	

}
