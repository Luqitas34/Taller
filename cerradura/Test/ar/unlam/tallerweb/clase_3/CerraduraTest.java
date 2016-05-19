package ar.unlam.tallerweb.clase_3;



import org.junit.Assert;
import org.junit.Test;

public class CerraduraTest {

	@Test
	public void testabrirCerradura() {
		Cerradura miCerradura= new Cerradura(1234);
		Assert.assertTrue(miCerradura.Abrir(1234));
			
	}
	
	@Test
	public void testnoAbreCerradura() {
		Cerradura miCerradura= new Cerradura(123);
		Assert.assertFalse(miCerradura.cerrar(1234));
	}
	
	@Test
	public void testclaveBloqueada(){
		Cerradura miCerradura= new Cerradura(12345);
		
		for(Integer i=0;i<3;i++){
		
		Assert.assertFalse(miCerradura.cerrar(1245));
		
		
		}
	
	}

	/*public cerradda
	public abierta
	public bloqueada
	public fallidos
	*/
}

	
