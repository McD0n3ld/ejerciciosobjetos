package edu.upc.eetac.dsa.raul.ejerciciosobjetos.ejercicio1;

public class PruebaArboles {
	public static void main(String args[]) {
		Arbol arbol1 = new Arbol(4);
		Arbol arbol2 = new Arbol("Roble");
		Arbol arbol3 = new Arbol();
		Arbol arbol4 = new Arbol(5, "Pino");
		arbol1.printTree();
		arbol2.printTree();
		arbol3.printTree();
		arbol4.printTree();
	}
}