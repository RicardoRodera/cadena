package cadena;

public class Cadena {

	public int longitud(String cadena) {
		return cadena.length();
	}

	public int vocales(String cadena) {
		int total = 0;

		for (int i = 0; i < cadena.length(); i++) {
			if (comprobarVocal(cadena.charAt(i))) {
				total++;
			}
		}

		return total;
	}

	private boolean comprobarVocal(char charAt) {
		switch (charAt) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
		case 'á':
		case 'é':
		case 'í':
		case 'ó':
		case 'ú':
		case 'ü':
			return true;
		default:
			return false;
		}
	}

	public String invertir(String cadena) {
		StringBuilder sb = new StringBuilder();
		sb.append(cadena);
		sb.reverse();
		return sb.toString();
	}

	public int contarLetra(String cadena, char caracter) {
		int total = 0;
		int primerChar = cadena.indexOf(caracter);
		if (primerChar >= 0) {
			for (int i = primerChar; i < cadena.length(); i++) {
				if (cadena.charAt(i) == caracter) {
					total++;
				}
			}
		}
		return total;
	}
}
