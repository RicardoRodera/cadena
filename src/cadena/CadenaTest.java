package cadena;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class CadenaTest {

	Cadena cadena = new Cadena();

	@Test
	void testLongitudCadenaNormal() {
		assertEquals(4, cadena.longitud("hola"));
	}

	@Test
	void testLongitudCadenaLarga() {
		assertEquals(28, cadena.longitud(" Esta prueba tiene espacios."));
	}
	
	@Test
	void testVocales() {
		assertEquals(2, cadena.vocales("hola"));
	}

	@Test
	void testVocalesConTildesYMayusculas() {
		assertEquals(4, cadena.vocales("hOla camión"));
	}
	
	@Test
	void testVocalesConDieresis() {
		assertEquals(4, cadena.vocales("Pingüino"));
	}
	
	@Test
	void testInvertir() {
		assertEquals("oniügniP", cadena.invertir("Pingüino"));
	}
}
