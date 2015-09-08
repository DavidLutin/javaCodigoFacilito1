package paquete;
import java.util.Stack;
class Main {

	public static void main(String[] args) {
		
		Stack pila = new Stack();
		pila.push(50);
		pila.push("String");
		pila.push(17);
		pila.push("Palabra");
		
		System.out.println("El ultimo elemento en la pila es "+pila.peek());
		
		while(pila.empty()==false)
		{
			System.out.println(pila.pop());
		}
		
	}

}
