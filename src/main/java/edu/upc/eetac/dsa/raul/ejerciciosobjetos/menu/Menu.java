package edu.upc.eetac.dsa.raul.ejerciciosobjetos.menu;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import edu.upc.eetac.dsa.raul.ejerciciosobjetos.ejercicio1.PruebaArboles;
import edu.upc.eetac.dsa.raul.ejerciciosobjetos.ejercicio2.PruebaFormas;

public class Menu {

	public static void main(String[] args) {
		String t = "";
		int ejercicio = 0;
		BufferedReader s = new BufferedReader(new InputStreamReader(System.in));

		while (true) {
			try {
				System.out.println("Introduce el numero de ejercicio que quieras comprobar. [1 - 2]. 0 para salir");
				t = s.readLine();
				ejercicio = Integer.parseInt(t);
			} catch (Exception e) {
				System.out.println("No has introducido un numero del 1 al 2");
				continue;
			}

			switch (ejercicio) {
			case 1:
				PruebaArboles.EX1();
				break;

			case 2:
				PruebaFormas.EX2();
				break;

			case 0:
				System.out.println("Fin del test");
				return;

			default:
				break;
			}
		}
	}

}
