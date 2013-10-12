package edu.upc.eetac.dsa.raul.ejerciciosobjetos.ejercicio2;

public class PruebaFormas {
	public static void EX2() {
		Forma[] s = new Forma[3];
		s[0] = new Forma();
		// Circulo es tambien una Forma
		s[1] = new Circulo();
		// Cuadrado es tambien una Forma
		s[2] = new Cuadrado();

		for (int i = 0; i < s.length; i++)
			s[i].queEs();
		return;
	}
}