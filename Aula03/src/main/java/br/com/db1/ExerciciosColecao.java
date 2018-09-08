package br.com.db1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ExerciciosColecao {
	
	
	public ExerciciosColecao(){
	
		
	}
	
	
	public List<String> exercicioCores(){
		List<String> cores = new ArrayList<String>();
		
		cores.add("Roxo");
		cores.add("Preto");
		cores.add("Vermelho");
		
		
		for (Integer contador = 0; contador<cores.size(); contador ++) {
			System.out.println(cores.get(contador));
		}
		
		return cores;
		
		
	}
	
	public Integer exercicioQuantidade(){

		
		List<String> lista = new ArrayList<String>();
		
		lista.add("Milho");
		lista.add("Tomate");
		lista.add("Arroz");
		lista.add("Feijao");
		
		
		Integer tamanho = lista.size();
		
		return tamanho;
		
	}
	
	public List<String> exercicioParentes(){
		
		List<String> listaFamilia = new ArrayList<String>();
		String pai = "José";
		String mae = "Maria";
		String irmao = "Anao";
		String irma = "Ana";
		String tio = "João";
		String tia = "Joana";
		String primo = "Junior";
		
		listaFamilia.add(pai);
		listaFamilia.add(mae);
		listaFamilia.add(irmao);
		listaFamilia.add(irma);
		listaFamilia.add(tio);
		listaFamilia.add(tia);
		listaFamilia.add(primo);
		
		listaFamilia.remove(listaFamilia.indexOf(pai));
		listaFamilia.remove(listaFamilia.indexOf(mae));
		
		
		
		
		
		
		return listaFamilia;

		
		
	}

	public List<String> exercicioCidades(){
		List<String> listaCidades = new ArrayList<String>();
		listaCidades.add("Corumbá");
		listaCidades.add("Dourados");
		listaCidades.add("Bonito");
		
		listaCidades.remove(1);
		
		return listaCidades;
		
	}
	
	public List<String> exercicioOrdem(){
		
		List<String> cores = new ArrayList<String>();
		
		cores.add("Roxo");
		cores.add("Preto");
		cores.add("Vermelho");
		
		Collections.sort(cores);
		
		for (Integer contador = 0; contador<cores.size(); contador ++) {
			System.out.println(cores.get(contador));
		}
			
		return cores;
	}
	
	public List<String> exercicioCoresRemocao(){
		List<String> cores = new ArrayList<String>();
		
		cores.add("Roxo");
		cores.add("Preto");
		cores.add("Vermelho");
		
		cores.remove(cores.indexOf("Vermelho"));
		
		for (Integer contador = 0; contador<cores.size(); contador ++) {
			System.out.println(cores.get(contador));
		}
		
		return cores;
		
		
	}
	
	public List<String> exercicioOrdemParentes(){
		
		List<String> listaFamilia = new ArrayList<String>();
		String pai = "José";
		String mae = "Maria";
		String irmao = "Anao";
		String irma = "Ana";
		String tio = "João";
		String tia = "Joana";
		String primo = "Junior";
		
		listaFamilia.add(pai);
		listaFamilia.add(mae);
		listaFamilia.add(irmao);
		listaFamilia.add(irma);
		listaFamilia.add(tio);
		listaFamilia.add(tia);
		listaFamilia.add(primo);
		
		
		Collections.sort(listaFamilia, Collections.reverseOrder());
		
		
		for (Integer contador = 0; contador < listaFamilia.size() ; contador++) {
			
			System.out.println(listaFamilia.get(contador));
		}
				
		
		
		return listaFamilia;
	}
		
	
	public void exercicioListaParidade() {
		List<Integer> listaPar = new ArrayList<Integer>();
		List<Integer> listaImpar = new ArrayList<Integer>();
		
		for (Integer numero = 1; numero <= 20; numero++) {
			if(numero>1 && numero%2 == 0) {
				listaPar.add(numero);
			}

			else {
				listaImpar.add(numero);
			}
			
		}
		
		for (Integer contador = 0; contador < listaPar.size() ; contador++) {
			
			System.out.println(listaPar.get(contador));
			
		}
		
		for (Integer contador = 0; contador < listaImpar.size() ; contador++) {
			
			System.out.println(listaImpar.get(contador));
			
		}
		
	}
	
	
	public Set<String> exercicioDistintos() {
		
		List<String> listaNomes = new ArrayList<String>();
		listaNomes.add("ANA");
		listaNomes.add("ANA LAURA");
		listaNomes.add("JOSE");
		listaNomes.add("WAGNER");
		listaNomes.add("RODOLFO");
		listaNomes.add("ROBERVAL");
		listaNomes.add("RODOLPHO");
		listaNomes.add("VAGNER");
		listaNomes.add("JOSÉ");
		listaNomes.add("JOALDO");
		listaNomes.add("CLECIO");
		listaNomes.add("JOSÉ");
		listaNomes.add("MARIA");
		listaNomes.add("MARCOS");
		
		Set<String> listaNomesDistintos = new TreeSet<String>(listaNomes);
		
		for (String nome : listaNomesDistintos) {
            System.out.println(nome);
		}
		return listaNomesDistintos;
		
	}
	
}