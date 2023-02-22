package es.studium.CajaBlanca3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestCajaBlanca
{

	@Test
	void camino1()
	{
		String resultadoEsperado = "La edad debe ser un número positivo.";
		String resultadoReal = CajaBlanca.edadPerro(-1);
		assertEquals(resultadoEsperado, resultadoReal);
	}
	
	@Test
	void camino2()
	{
		String resultadoEsperado = "La edad es 10.5";
		String resultadoReal = CajaBlanca.edadPerro(1);
		assertEquals(resultadoEsperado, resultadoReal);
	}
	
	@Test
	void camino3()
	{
		String resultadoEsperado = "La edad es 25.0";
		String resultadoReal = CajaBlanca.edadPerro(3);
		assertEquals(resultadoEsperado, resultadoReal);
	}

}
