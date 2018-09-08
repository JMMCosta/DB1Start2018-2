package br.com.db1;

import static org.junit.Assert.*;

import org.junit.Test;

public class ExerciciosColecaoTest {

	@Test
	public void testExerciciosColecao() {
	
	}

	@Test
	public void testExercicioCores() {
		
		ExerciciosColecao objetoExemplo = new ExerciciosColecao();
		
		assertTrue(objetoExemplo.exercicioCores().size() == 3);
		assertFalse(objetoExemplo.exercicioCores().size() == 2);
		assertEquals("Preto", objetoExemplo.exercicioCores().get(1));	
		
	}

	@Test
	public void testExercicioQuantidade() {
		ExerciciosColecao objetoExemplo = new ExerciciosColecao();
		assertTrue(objetoExemplo.exercicioQuantidade() == 4);
		assertFalse(objetoExemplo.exercicioQuantidade() == 7);
		
		
	}

	@Test
	public void testExercicioParentes() {
		ExerciciosColecao objetoExemplo = new ExerciciosColecao();
		
		assertTrue(objetoExemplo.exercicioParentes().size() == 5);
		assertFalse(objetoExemplo.exercicioParentes().size() == 7);
		assertEquals("Junior", objetoExemplo.exercicioParentes().get(4));
		assertFalse(objetoExemplo.exercicioParentes().contains("José"));		
		
	}

	@Test
	public void testExercicioCidades() {
		
		ExerciciosColecao objetoExemplo = new ExerciciosColecao();
		
		assertTrue(objetoExemplo.exercicioCidades().size() == 2);
		assertFalse(objetoExemplo.exercicioCidades().size() == 3);
		assertEquals("Corumbá", objetoExemplo.exercicioCidades().get(0));
		assertFalse(objetoExemplo.exercicioCidades().contains("Dourados"));
		
	}

	@Test
	public void testExercicioOrdem() {
		
		ExerciciosColecao objetoExemplo = new ExerciciosColecao();
		
		assertTrue(objetoExemplo.exercicioOrdem().size() == 3);
		assertFalse(objetoExemplo.exercicioOrdem().size() == 2);
		assertEquals("Roxo", objetoExemplo.exercicioOrdem().get(1));
		assertFalse(objetoExemplo.exercicioOrdem().indexOf("Vermelho") < objetoExemplo.exercicioCidades().indexOf("Preto"));
			
	}

	@Test
	public void testExercicioCoresRemocao() {
		
		ExerciciosColecao objetoExemplo = new ExerciciosColecao();
		
		assertTrue(objetoExemplo.exercicioCoresRemocao().size() == 2);
		assertFalse(objetoExemplo.exercicioCoresRemocao().size() == 3);
		assertEquals("Roxo", objetoExemplo.exercicioCoresRemocao().get(0));
		assertFalse(objetoExemplo.exercicioCoresRemocao().contains("Vermelho"));
			
		
	}

	@Test
	public void testExercicioOrdemParentes() {
		
		ExerciciosColecao objetoExemplo = new ExerciciosColecao();
		
		assertTrue(objetoExemplo.exercicioOrdemParentes().size() == 7);
		assertFalse(objetoExemplo.exercicioOrdemParentes().size() == 5);
		assertEquals("Ana", objetoExemplo.exercicioOrdemParentes().get(6));
		assertTrue(objetoExemplo.exercicioOrdemParentes().contains("José"));
		
	}

	@Test
	public void testExercicioListaParidade() {
		
		ExerciciosColecao objetoExemplo = new ExerciciosColecao();
		objetoExemplo.exercicioListaParidade();
		
		
	}

	@Test
	public void testExercicioDistintos() {
		
		ExerciciosColecao objetoExemplo = new ExerciciosColecao();
		
		assertTrue(objetoExemplo.exercicioDistintos().size() == 13);
		assertFalse(objetoExemplo.exercicioDistintos().size() == 14);
		assertTrue(objetoExemplo.exercicioDistintos().contains("CLECIO"));
		
		
		
	}

}
