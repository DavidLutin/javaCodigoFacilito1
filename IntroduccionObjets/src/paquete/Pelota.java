package paquete;

public class Pelota {
	
	float radio;
	float peso;
	
	public Pelota()
	{
		radio=100;
		peso=250;
	}
	
	public Pelota(float radio,float peso)
	{
		this.radio=radio;
		this.peso=peso;
	}
	
	public float obtenerRadio()
	{
		return this.radio;
	}
	
	public float obtenerPeso()
	{
		return this.peso;
	}
	
	public void partearPelota()
	{
		System.out.println("Haz pateado la pelota");
	}
	public void atraparPelota()
	{
		System.out.println("Haz atrapado la pelota");
	}

}
