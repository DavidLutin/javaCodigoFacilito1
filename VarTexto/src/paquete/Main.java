package paquete;
import java.io.*;

class Main {

	public static void main(String[] args) {
		
		String texto ="";
		double x=50.3;
		
		texto = String.valueOf(x);
		/*
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader buffer = new BufferedReader(in);
		
		try{
			texto = buffer.readLine();
			x = Double.parseDouble(texto);
		}catch(Exception e) {
			System.out.println("Debes escribir un numero");
		};*/
		texto = texto.concat("-Double");
		System.out.println(texto);
		
		
	}

}
