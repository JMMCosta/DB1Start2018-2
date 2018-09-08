package br.com.db1;

import static org.junit.Assert.*;

import org.junit.Test;

public class ExerciciosDoubleTest {

	@Test
	public void testExercicioMenorDeDois() {
		ExerciciosDouble objetoExemplo =  new ExerciciosDouble();
		
		assertTrue(objetoExemplo.exercicioMenorDeDois(6.00, 8.00) == 6.00);
		assertTrue(objetoExemplo.exercicioMenorDeDois(8.00, 6.00) == 6.00);
		assertFalse(objetoExemplo.exercicioMenorDeDois(6.00, 8.00) == 8.00);
		assertFalse(objetoExemplo.exercicioMenorDeDois(8.00, 6.00) == 8.00);
		
	}

	@Test
	public void testExercicioMenorDeTres() {
		
		ExerciciosDouble objetoExemplo =  new ExerciciosDouble();
		
		assertTrue(objetoExemplo.exercicioMenorDeTres(6.00, 8.00, 7.00) == 6.00);
		assertTrue(objetoExemplo.exercicioMenorDeTres(8.00, 6.00, 7.00) == 6.00);
		assertFalse(objetoExemplo.exercicioMenorDeTres(6.00, 8.00, 7.00) == 8.00);
		assertFalse(objetoExemplo.exercicioMenorDeTres(8.00, 6.00, 7.00) == 8.00);
		
		
	}

	@Test
	public void testExercicioMediaDeTres() {
		
		ExerciciosDouble objetoExemplo =  new ExerciciosDouble();
		
		assertTrue(objetoExemplo.exercicioMediaDeTres(6.00, 8.00, 7.00) == 7.00);
		assertTrue(objetoExemplo.exercicioMediaDeTres(8.00, 6.00, 7.00) == 7.00);
		assertFalse(objetoExemplo.exercicioMediaDeTres(6.00, 8.00, 7.00) == 8.00);
		assertFalse(objetoExemplo.exercicioMediaDeTres(8.00, 6.00, 7.00) == 8.00);
		
		
	}

	@Test
	public void testExercicioAreaTriangulo() {
		
		ExerciciosDouble objetoExemplo =  new ExerciciosDouble();
		
		assertTrue(objetoExemplo.exercicioAreaTriangulo(6.00, 8.00) == 24.00);
		assertTrue(objetoExemplo.exercicioAreaTriangulo(8.00, 6.00) == 24.00);
		assertFalse(objetoExemplo.exercicioAreaTriangulo(6.00, 8.00) == 6.00);
		assertFalse(objetoExemplo.exercicioAreaTriangulo(8.00, 6.00) == 8.00);
		
		
		
	}

}
