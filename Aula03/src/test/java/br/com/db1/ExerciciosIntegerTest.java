package br.com.db1;

import static org.junit.Assert.*;

import org.junit.Test;

public class ExerciciosIntegerTest {

	@Test
	public void testExercicioSoma() {
		
		ExerciciosInteger objetoExemplo = new ExerciciosInteger();
		
		assertTrue(objetoExemplo.exercicioSoma(2, 3) == 5);
		assertFalse(objetoExemplo.exercicioSoma(2, 3) == 6);
		
	}

	@Test
	public void testExercicioSubtracao() {
		
		ExerciciosInteger objetoExemplo = new ExerciciosInteger();
		
		assertTrue(objetoExemplo.exercicioSubtracao(3, 3) == 0);
		assertFalse(objetoExemplo.exercicioSubtracao(3, 3) == 1);
		
	}

	@Test
	public void testExercicioMultiplicacao() {
		
		ExerciciosInteger objetoExemplo = new ExerciciosInteger();
		
		assertTrue(objetoExemplo.exercicioMultiplicacao(2, 3) == 6);
		assertFalse(objetoExemplo.exercicioMultiplicacao(2, 3) == 5);
		
		
	}

	@Test
	public void testExercicioDivisao() {
		
		ExerciciosInteger objetoExemplo = new ExerciciosInteger();
		
		assertTrue(objetoExemplo.exercicioDivisao(3, 3) == 1);
		assertFalse(objetoExemplo.exercicioDivisao(3, 3) == 0);
		
	}

	@Test
	public void testExercicioParidade() {
		
		ExerciciosInteger objetoExemplo = new ExerciciosInteger();
		
		assertTrue(objetoExemplo.exercicioParidade(6));
		assertFalse(objetoExemplo.exercicioParidade(21));
		
		
		
		
	}

	@Test
	public void testExercicioMaior() {
		
		ExerciciosInteger objetoExemplo = new ExerciciosInteger();
		
		assertTrue(objetoExemplo.exercicioMaior(2, 3) == 3);
		assertTrue(objetoExemplo.exercicioMaior(3, 2) == 3);
		assertFalse(objetoExemplo.exercicioMaior(2, 3) == 2);
		assertFalse(objetoExemplo.exercicioMaior(3, 2) == 2);
		
	}

	@Test
	public void testExercicioListaImpares() {
		
		ExerciciosInteger objetoExemplo = new ExerciciosInteger();
		
		assertTrue(objetoExemplo.exercicioListaImpares(100).isEmpty());
		assertTrue(objetoExemplo.exercicioListaImpares(50).size() == 0);

		
		
	}

}
