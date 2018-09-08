package br.com.db1;

import static org.junit.Assert.*;

import org.junit.Test;

public class ExerciciosStringTest {

	@Test
	public void testExercicioMaiuscula() {
		ExerciciosString objetoExemplo =  new ExerciciosString();
		
		assertEquals("TESTE", objetoExemplo.exercicioMaiuscula("teste"));
		assertNotEquals("teste", objetoExemplo.exercicioMaiuscula("teste"));
		
	}

	@Test
	public void testExercicioMinuscula() {
		
		ExerciciosString objetoExemplo =  new ExerciciosString();
		
		assertEquals("teste", objetoExemplo.exercicioMinuscula("TESTE"));
		assertNotEquals("TESTE", objetoExemplo.exercicioMinuscula("TESTE"));
		
	}

	@Test
	public void testExercicioTamanho() {
		
		ExerciciosString objetoExemplo =  new ExerciciosString();
		
		assertTrue(objetoExemplo.exercicioTamanho() == 8);
		assertFalse(objetoExemplo.exercicioTamanho() == 9);
		
	}

	@Test
	public void testExercicioTamanhoComEspacos() {
		
		ExerciciosString objetoExemplo =  new ExerciciosString();
		
		assertTrue(objetoExemplo.exercicioTamanhoComEspacos() == 10);
		assertFalse(objetoExemplo.exercicioTamanhoComEspacos() == 7);
		
		
	}

	@Test
	public void testExercicioTamanhoSemEspacos() {
		
		ExerciciosString objetoExemplo =  new ExerciciosString();
		
		assertTrue(objetoExemplo.exercicioTamanhoSemEspacos() == 8);
		assertFalse(objetoExemplo.exercicioTamanhoSemEspacos() == 9);
		
	}

	@Test
	public void testExercicioNomeCurtoComeco() {
		
		ExerciciosString objetoExemplo =  new ExerciciosString();
		
		assertEquals("João", objetoExemplo.exercicioNomeCurtoComeco("João Pereira dos Santos"));
		assertNotEquals("João ", objetoExemplo.exercicioNomeCurtoComeco("João Pereira dos Santos"));
		
	}

	@Test
	public void testExercicioNomeTerceiroCaractere() {
		
ExerciciosString objetoExemplo =  new ExerciciosString();
		
		assertEquals("o Pereira dos Santos", objetoExemplo.exercicioNomeTerceiroCaractere("João Pereira dos Santos"));
		assertNotEquals("João Pereira dos Santos", objetoExemplo.exercicioNomeTerceiroCaractere("João Pereira dos Santos"));
				
	}

	@Test
	public void testExercicioNomeCurtoFim() {
		
		ExerciciosString objetoExemplo =  new ExerciciosString();
		
		assertEquals("ntos", objetoExemplo.exercicioNomeCurtoFim("João Pereira dos santos"));
		assertNotEquals("antos", objetoExemplo.exercicioNomeCurtoFim("João Pereira dos santos"));
		
		
	}

	@Test
	public void testExercicioNomeSubistituicao() {
		
		ExerciciosString objetoExemplo =  new ExerciciosString();
		
		assertEquals("ALUNO Pereira dos santos", objetoExemplo.exercicioNomeSubistituicao("João Pereira dos santos"));
		assertNotEquals("João Pereira dos santos", objetoExemplo.exercicioNomeSubistituicao("João Pereira dos santos"));
		
		
		
	}

	@Test
	public void testExercicioFrutas() {
		
		ExerciciosString objetoExemplo =  new ExerciciosString();
		
		assertTrue(objetoExemplo.exercicioFrutas().length == 3);
		assertFalse(objetoExemplo.exercicioFrutas().length == 1);
		
		
	}

	@Test
	public void testExercicioVogais() {
		
		ExerciciosString objetoExemplo =  new ExerciciosString();
		
		assertTrue(objetoExemplo.exercicioVogais("aeiou") == 5);
		assertTrue(objetoExemplo.exercicioVogais("zyzayzx") == 1);
		assertFalse(objetoExemplo.exercicioVogais("aaeeiioouu") == 5);
		
	}

	@Test
	public void testExercicioInvertido() {
		
		ExerciciosString objetoExemplo =  new ExerciciosString();
		
		assertEquals("kaerb", objetoExemplo.exercicioInvertido("break"));
		assertNotEquals("break", objetoExemplo.exercicioInvertido("break"));
		
		
		
		
	}

}
