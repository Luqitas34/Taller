package ar.edu.unlam.tallerwebI.tp1;


public class Alumno {
	Integer primerParcial;
	Integer segundoParcial;

	public void calificarPrimerParcial(Integer notaPrimerParcial){
		primerParcial=notaPrimerParcial;
		
	}
	
	public void calificarSegundoParcial(Integer notaSegundoParcial){
	    segundoParcial=notaSegundoParcial;
	
	}
	
	public Integer getPrimerParcial(){
		return primerParcial;  
	}
	
	public Integer getSegundoParcial(){
		return segundoParcial;  
	}

	public boolean estaAprobado(){
		calificarPrimerParcial(primerParcial);
		calificarSegundoParcial(segundoParcial);
		if(primerParcial>=4 && primerParcial>=4){	
			return true;
		}
		else{
			return false;
		}
	}
	
	public boolean estaAprobadoPorPromedio(){
		Integer promedio=(primerParcial+segundoParcial)/2;
		if(promedio>=4 ){
			return true;
		}
		else{
			return false;
		}
	}
	
	public boolean estaPromocionado(){
		calificarPrimerParcial(primerParcial);
		calificarSegundoParcial(segundoParcial);
		if( primerParcial>=7 && primerParcial>=7){
			return true;
		}
		else{
			return false;
		}
	}
	
	public boolean estaPromocionadoPorPromedio(){
		Integer promedio=(primerParcial+segundoParcial)/2;		
		if(promedio>=7 ){
			return true;
		}
		else{
			return false;
			}
		}
	}
