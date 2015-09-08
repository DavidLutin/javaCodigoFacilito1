package paquete;

import java.util.LinkedList;

class Main {

	public static void main(String[] args) {
		
		LinkedList lista = new LinkedList();
		
		lista.add("Palabra");
		lista.add(5);
		lista.add(1,17);
		lista.add("palabra 2");
		
		lista.removeLast();
		
		System.out.println("El tamaño de la lista es: "+lista.size());
		System.out.println(lista.getLast());
		
	}

}
