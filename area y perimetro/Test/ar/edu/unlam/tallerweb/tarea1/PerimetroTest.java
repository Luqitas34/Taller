package ar.edu.unlam.tallerweb.tarea1;

import org.junit.Assert;
import org.junit.Test;

public class PerimetroTest {

	@org.junit.Test
	public void testPerimetroCuadrado() {
		Perimetro miPerimetro= new Perimetro();
		Integer lado=7;
		float perimetroObtenido=miPerimetro.PerimetroCuadrado(lado);
		
		float perimetroEsperado=28;
		
		Assert.assertEquals(perimetroEsperado,perimetroObtenido,0.1);
		
		miPerimetro=null;
		
	}
	
	@Test
	public void testPerimetroCirculo()
	{
		Perimetro miPerimetro= new Perimetro();
		Integer radio=15;
		float perimetroObtenido=miPerimetro.PerimetroCirculo(radio);
		
		float perimetroEsperado=94.2F;
		
		Assert.assertEquals(perimetroEsperado,perimetroObtenido,0.1);
		
		miPerimetro=null;
		
	}
	
}