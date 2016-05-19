package ar.edu.unlam.tallerweb.tarea1;

public class Perimetro {
	float resultado;
	float pi=3.14F;
	public float PerimetroCuadrado(Integer lado){
		
		resultado=lado*4;
		
		return resultado;
	}
	
	public float PerimetroCirculo(Integer radio){
		
		resultado=2*pi*radio;
		
		return resultado;
		
	}
}

