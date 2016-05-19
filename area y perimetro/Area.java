package ar.edu.unlam.tallerweb.tarea1;

public class Area {
	float resultado;
	float pi=3.14F;
	public float AreaCuadrado(Integer lado){
		
		resultado=lado*lado;
		
		return resultado;
	}
	
	public float AreaCirculo(Integer radio){
		
		resultado=(pi*radio*radio);
		
		return resultado;
		
	}
}
