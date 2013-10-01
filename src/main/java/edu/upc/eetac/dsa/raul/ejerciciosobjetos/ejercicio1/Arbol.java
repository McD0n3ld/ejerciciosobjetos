package edu.upc.eetac.dsa.raul.ejerciciosobjetos.ejercicio1;

public class Arbol {
	private int longitud;
	private String nombre;

	public Arbol() {
		super();
	}

	public Arbol(int longitud) {
		super();
		this.longitud = longitud;
	}

	public Arbol(String nombre) {
		super();
		this.nombre = nombre;
	}

	public Arbol(int longitud, String nombre) {
		super();
		this.longitud = longitud;
		this.nombre = nombre;
	}

	public void printTree() {
		String txt;
		if (nombre == null) {
			if (longitud == 0)
				txt = "Un árbol generico";
			else
				txt = "Un árbol de "+longitud+" metros.";
		} else {
			if (longitud == 0)
				txt = "Un "+nombre;
			else
				txt = "Un "+nombre+" de "+longitud+" metros.";
		}
		System.out.println(txt);
		return;
	}

}
