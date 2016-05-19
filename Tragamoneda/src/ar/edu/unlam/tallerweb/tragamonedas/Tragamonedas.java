package ar.edu.unlam.tallerweb.tragamonedas;

public class Tragamonedas {
	
	Integer tambor1,tambor2,tambor3;
	public void activar(){
		Tambor nuevotambor=new Tambor();
		
		tambor1=nuevotambor.obtenerPosicion();
		tambor2=nuevotambor.obtenerPosicion();
		tambor3=nuevotambor.obtenerPosicion();
		
	}
	public void entregarPremio(){
		activar();
		System.out.println(tambor1);
		System.out.println(tambor2);
		System.out.println(tambor3);
		if(tambor1==tambor2 && tambor2==tambor3)
		{
			System.out.println("\n\nGANADOR");
		}
		else
		{
			System.out.println("\n\nPERDEDOR");
		}
	}
}
