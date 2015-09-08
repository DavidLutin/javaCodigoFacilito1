package paquete;
import java.util.LinkedList;
class Main {

	public static void main(String[] args) {
		//FIFO first.in, first.out
		LinkedList cola= new LinkedList();
		
		for(int i=1;i<11;i++)
			cola.offer(i);
		
		while(cola.peek()!=null)
		{
			System.out.println(cola.poll());
		}

	}

}