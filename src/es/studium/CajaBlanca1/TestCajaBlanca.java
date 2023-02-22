package es.studium.CajaBlanca1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;



class TestCajaBlanca
{
	
	@Test
	void camino1()
	{
		boolean resultadoEsperado = true;
		boolean resultadoReal = CajaBlanca.esPar(2);
		assertEquals(resultadoEsperado, resultadoReal);
	}
	
	@Test
	void camino2()
	{
		boolean resultadoEsperado = false;
		boolean resultadoReal = CajaBlanca.esPar(3);
		assertEquals(resultadoEsperado, resultadoReal);
	}
	
}
