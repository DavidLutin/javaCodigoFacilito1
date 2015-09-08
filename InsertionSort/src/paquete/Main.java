package paquete;

class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arreglo = {5,15,7,15,4,12,4,75,1,3,5,7,6,11,4,12,23,3,4,2,1,45,13};
		Ordenador o = new Ordenador();
		o.ordenarInsercion(arreglo);
		
		for(int i = 0;i<arreglo.length;i++)
		{
			System.out.println(arreglo[i]);
		}

	}

}
