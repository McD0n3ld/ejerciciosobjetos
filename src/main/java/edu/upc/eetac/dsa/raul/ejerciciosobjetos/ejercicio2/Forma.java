package edu.upc.eetac.dsa.raul.ejerciciosobjetos.ejercicio2;

public class Forma {
	String forma;

	public Forma(String nombre) {
		super();
		this.forma = nombre;
	}

	public Forma() {
		super();
		this.forma = "genérica";
	}
	
	public void queEs() {
		System.out.println("Un objeto de forma "+forma);
	}
	
	
	
}
