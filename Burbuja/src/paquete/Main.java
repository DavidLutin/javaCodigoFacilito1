package paquete;

public class Main {

	public static void main(String[] args) {
		
		int[]arreglo = {5,11,12,7,4,23,15,3,4,2,1,45,13};
		Ordenador o = new Ordenador();
		o.ordenarBurbuja(arreglo);
		
		for(int i=0;i<arreglo.length;i++)
		{
			System.out.println(arreglo[i]);
		}
		

	}

}
