//tambor
//metodo girar()
//metodo obtener posicion()
 
//tragam
//activar ()
//entrega premio()

package ar.edu.unlam.tallerweb.tragamonedas;
import java.util.Random;
public class Tambor {
	Integer posicion;
	
	public Integer girar(){
		Random  rnd = new Random();
		 return rnd.nextInt(2)+1;
	}
	
	public Integer obtenerPosicion(){

		posicion=girar();
		return posicion;
	}
	
}
