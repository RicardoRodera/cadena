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

}
