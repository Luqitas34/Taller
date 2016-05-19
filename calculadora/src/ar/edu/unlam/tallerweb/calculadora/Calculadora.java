package ar.edu.unlam.tallerweb.calculadora;

public class Calculadora {
	

	Integer resultado=0;
	
	
	public Integer Sumar(Integer a, Integer b){
		
		resultado=a+b;
		return resultado;
	}
	
	public Integer multiplicar(Integer a,Integer b){
		
		resultado=a*b;
		return resultado;

	}
	
	public Integer resultado(){
		
		return resultado;
			

	}
	
}