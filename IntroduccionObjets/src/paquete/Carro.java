package paquete;

public class Carro {
	
	double peso;
	double altura;
	double ancho;
	double largo;
	int numeroPuertas;
	boolean encendido;
	String modelo;
	
	
	public Carro()
	{
		this.peso = 1000;
		this.altura = 1.90;
		this.ancho = 4;	
	}
	
	public double obtenerPeso()
	{
		return this.peso;
	}
	
	public void encender()
	{
		this.encendido=true;
		System.out.println("El carro esta encendido");
	}
	public void apagar()
	{
		this.encendido=false;
		System.out.println("El carro esta apagado");
	}
	public void estado()
	{
		if(this.encendido == true)
			System.out.println("El carro esta encendido");
		else
			System.out.println("El carro esta apagado");
		
	}
	
	public void informacion()
	{
		System.out.println("Este es un carro comun y corriente");
	}

}

class CarroBMW extends Carro
{
	public CarroBMW()
	{
		this.modelo="BMW";
	}
	public void turbo()
	{
		System.out.println("Acabas de viajar a 100 millas por hora");
	}
	public void informacion()
	{
		System.out.println("Este es un BMW del año 2011");
	}
}

class CarroToyota extends Carro
{
	public CarroToyota()
	{
		modelo = "Toyota";
	}
	public void informacion()
	{
		System.out.println("Este es un Toyota del año 2010");
	}
	
}
