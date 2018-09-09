package br.com.db1.type;

import static org.junit.Assert.*;

import org.junit.Test;

public class EstadosDoBrasilTest {

	@Test
	public void testGetNomeEstado() {
		assertEquals("Sergipe", EstadosDoBrasil.SERGIPE.getNomeEstado());
		
	}

	@Test
	public void testGetSiglaEstado() {
		assertEquals("SE", EstadosDoBrasil.SERGIPE.getSiglaEstado());
		
	}

	@Test
	public void testEstadosDoNorte() {
		
		assertTrue(EstadosDoBrasil.estadosDoNorte().size() == 7);
		assertTrue(EstadosDoBrasil.estadosDoNorte().contains(EstadosDoBrasil.TOCANTINS));
		assertTrue(EstadosDoBrasil.estadosDoNorte().contains(EstadosDoBrasil.PARA));
		assertTrue(EstadosDoBrasil.estadosDoNorte().contains(EstadosDoBrasil.AMAPA));
		assertFalse(EstadosDoBrasil.estadosDoNorte().contains(EstadosDoBrasil.CEARA));
	}

	@Test
	public void testEstadosDoNordeste() {
		
		assertTrue(EstadosDoBrasil.estadosDoNordeste().size() == 9);
		assertTrue(EstadosDoBrasil.estadosDoNordeste().contains(EstadosDoBrasil.CEARA));
		assertTrue(EstadosDoBrasil.estadosDoNordeste().contains(EstadosDoBrasil.SERGIPE));
		assertTrue(EstadosDoBrasil.estadosDoNordeste().contains(EstadosDoBrasil.PERNAMBUCO));
		assertFalse(EstadosDoBrasil.estadosDoNordeste().contains(EstadosDoBrasil.SAO_PAULO));
		
	}

	@Test
	public void testEstadosDoCentroOeste() {
		
		assertTrue(EstadosDoBrasil.estadosDoCentroOeste().size() == 3);
		assertTrue(EstadosDoBrasil.estadosDoCentroOeste().contains(EstadosDoBrasil.MATO_GROSSO));
		assertTrue(EstadosDoBrasil.estadosDoCentroOeste().contains(EstadosDoBrasil.MATO_GROSSO_DO_SUL));
		assertTrue(EstadosDoBrasil.estadosDoCentroOeste().contains(EstadosDoBrasil.GOIAS));
		assertFalse(EstadosDoBrasil.estadosDoCentroOeste().contains(EstadosDoBrasil.ALAGOAS));
		
		
		
	}

	@Test
	public void testEstadosDoSudeste() {
		
		assertTrue(EstadosDoBrasil.estadosDoSudeste().size() == 4);
		assertTrue(EstadosDoBrasil.estadosDoSudeste().contains(EstadosDoBrasil.SAO_PAULO));
		assertTrue(EstadosDoBrasil.estadosDoSudeste().contains(EstadosDoBrasil.RIO_DE_JANEIRO));
		assertTrue(EstadosDoBrasil.estadosDoSudeste().contains(EstadosDoBrasil.MINAS_GERAIS));
		assertFalse(EstadosDoBrasil.estadosDoSudeste().contains(EstadosDoBrasil.RORAIMA));
		
		
		
	}

	@Test
	public void testEstadosDoSul() {
		
		assertTrue(EstadosDoBrasil.estadosDoSul().size() == 3);
		assertTrue(EstadosDoBrasil.estadosDoSul().contains(EstadosDoBrasil.RIO_GRANDE_DO_SUL));
		assertTrue(EstadosDoBrasil.estadosDoSul().contains(EstadosDoBrasil.PARANA));
		assertTrue(EstadosDoBrasil.estadosDoSul().contains(EstadosDoBrasil.SANTA_CATARINA));
		assertFalse(EstadosDoBrasil.estadosDoSul().contains(EstadosDoBrasil.MARANHAO));
		
		
		
		
	}

	@Test
	public void testDistrito() {
		
		assertEquals("DF", EstadosDoBrasil.distrito().getSiglaEstado());
		
	}

}
