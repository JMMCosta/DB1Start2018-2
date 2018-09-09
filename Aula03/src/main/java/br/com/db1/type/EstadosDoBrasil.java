package br.com.db1.type;

import java.util.ArrayList;
import java.util.List;

public enum EstadosDoBrasil {
	
	ACRE("Acre","AC"), AMAPA("Amapá", "AP"), AMAZONAS("Amazonas", "AM"), PARA("Pará", "PA"), RONDONIA("Rondônia", "RO"), RORAIMA("Roraima", "RR"), TOCANTINS("Tocantins", "TO"),
	ALAGOAS("Alagoas", "AL"), BAHIA("Bahia", "BA"), CEARA("Ceará", "CE"), MARANHAO("Maranhão", "MA"), PARAIBA("Paraíba", "PB"), PERNAMBUCO("Pernambuco", "PE"), PIAUI("Piauí", "PI"), 
	RIO_GRANDE_DO_NORTE("Rio Grande do Norte", "RN"), SERGIPE("Sergipe","SE"), DISTRITO_FEDERAL("Distrito Federal", "DF"), GOIAS("Goiás", "GO"), MATO_GROSSO("Mato Grosso", "MT"),
	MATO_GROSSO_DO_SUL("Mato Grosso do Sul", "MS"), ESPIRITO_SANTO("Espírito Santo", "ES"), MINAS_GERAIS("Minas Gerais", "MG"), RIO_DE_JANEIRO("Rio de Janeiro", "RJ"), SAO_PAULO("São Paulo", "SP"),
	PARANA("Paraná", "PR"), RIO_GRANDE_DO_SUL("Rio Grande do Sul", "RS"), SANTA_CATARINA("Santa Catarina", "SC");
	 
	
	
	private String nomeEstado;
	private String siglaEstado;
	
	public String getNomeEstado() {
		return nomeEstado;
	}

	public String getSiglaEstado() {
		return siglaEstado;
	}

	private EstadosDoBrasil(String estado, String sigla) {
		
		this.nomeEstado = estado;
		this.siglaEstado = sigla;
		
	}
	
	
	public static List<EstadosDoBrasil> estadosDoNorte(){
		
		List<EstadosDoBrasil> regiaoNorte = new ArrayList<EstadosDoBrasil>();
		
		regiaoNorte.add(EstadosDoBrasil.AMAZONAS);
		regiaoNorte.add(EstadosDoBrasil.AMAPA);
		regiaoNorte.add(EstadosDoBrasil.PARA);
		regiaoNorte.add(EstadosDoBrasil.TOCANTINS);
		regiaoNorte.add(EstadosDoBrasil.RONDONIA);
		regiaoNorte.add(EstadosDoBrasil.RORAIMA);
		regiaoNorte.add(EstadosDoBrasil.ACRE);
		
		
		
		return regiaoNorte;
				
		
	}
	
	public static List<EstadosDoBrasil> estadosDoNordeste(){
		
		List<EstadosDoBrasil> regiaoNordeste = new ArrayList<EstadosDoBrasil>();
		
		regiaoNordeste.add(EstadosDoBrasil.MARANHAO);
		regiaoNordeste.add(EstadosDoBrasil.PIAUI);
		regiaoNordeste.add(EstadosDoBrasil.CEARA);
		regiaoNordeste.add(EstadosDoBrasil.RIO_GRANDE_DO_NORTE);
		regiaoNordeste.add(EstadosDoBrasil.SERGIPE);
		regiaoNordeste.add(EstadosDoBrasil.PERNAMBUCO);
		regiaoNordeste.add(EstadosDoBrasil.PARAIBA);
		regiaoNordeste.add(EstadosDoBrasil.ALAGOAS);
		regiaoNordeste.add(EstadosDoBrasil.BAHIA);
		
		
		
		return regiaoNordeste;
				
		
	}
	
	public static List<EstadosDoBrasil> estadosDoCentroOeste(){
		
		List<EstadosDoBrasil> regiaoCentroOeste = new ArrayList<EstadosDoBrasil>();
		
		regiaoCentroOeste.add(EstadosDoBrasil.MATO_GROSSO);
		regiaoCentroOeste.add(EstadosDoBrasil.MATO_GROSSO_DO_SUL);
		regiaoCentroOeste.add(EstadosDoBrasil.GOIAS);

		
		
		
		return regiaoCentroOeste;
				
		
	}
	
	public static List<EstadosDoBrasil> estadosDoSudeste(){
		
		List<EstadosDoBrasil> regiaoSudeste = new ArrayList<EstadosDoBrasil>();
		
		regiaoSudeste.add(EstadosDoBrasil.SAO_PAULO);
		regiaoSudeste.add(EstadosDoBrasil.RIO_DE_JANEIRO);
		regiaoSudeste.add(EstadosDoBrasil.MINAS_GERAIS);
		regiaoSudeste.add(EstadosDoBrasil.ESPIRITO_SANTO);
			
		
		
		return regiaoSudeste;
				
		
	}
	
	public static List<EstadosDoBrasil> estadosDoSul(){
		
		List<EstadosDoBrasil> regiaoSul = new ArrayList<EstadosDoBrasil>();
		
		regiaoSul.add(EstadosDoBrasil.PARANA);
		regiaoSul.add(EstadosDoBrasil.SANTA_CATARINA);
		regiaoSul.add(EstadosDoBrasil.RIO_GRANDE_DO_SUL);

		
		
		return regiaoSul;
				
		
	}
	
	public static EstadosDoBrasil distrito() {
		
		return DISTRITO_FEDERAL;				
		
	}
	
	

}
