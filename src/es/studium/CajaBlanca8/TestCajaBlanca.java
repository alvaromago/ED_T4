package es.studium.CajaBlanca8;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestCajaBlanca
{

	@Test
	void camino1()
	{
		int resultadoEsperado = 3;
		int resultadoReal = CajaBlanca.posicion("p", "pepe");
		assertEquals(resultadoEsperado, resultadoReal);
	}
	
	@Test
	void camino2()
	{
		int resultadoEsperado = 0;
		int resultadoReal = CajaBlanca.posicion("p", "María");
		assertEquals(resultadoEsperado, resultadoReal);
	}
	
	@Test
	void camino3()
	{
		int resultadoEsperado = 0;
		int resultadoReal = CajaBlanca.posicion("p", "");
		assertEquals(resultadoEsperado, resultadoReal);
	}
}
