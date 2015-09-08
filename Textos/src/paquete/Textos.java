package paquete;
import java.io.*;
public class Textos {
	public void escribir(String nombreArchivo)
	{
		File f;
		f = new File(nombreArchivo);
		
		
		try{
			FileWriter w = new FileWriter(f);
			BufferedWriter bw = new BufferedWriter(w);
			PrintWriter wr = new PrintWriter(bw);
			
			
			wr.write("Esto es una linea de texto");
			wr.append("\nEsta es una segunda linea de texto");
			wr.close();
			bw.close();
		}catch(IOException e){};
		
	}
	
	public void leer(String nombreArchivo)
	{
		try{
			
			FileReader r = new FileReader(nombreArchivo);
			BufferedReader buffer = new BufferedReader(r);
			
			String temp="";
			 
			while(temp!=null){
			 
			 	temp = buffer.readLine();
			 	if(temp==null)
			 		break;
			 	System.out.println(temp);	
			 
			}; 
			 
		}catch(Exception e){
			System.out.println(e.getMessage());
		};
	}

}
