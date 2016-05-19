package ar.edu.unlam.tallerweb.tarea1;

import org.junit.Test;
import org.junit.Assert;

public class AreaTest {

	@org.junit.Test
	public void testAreaCuadrado() {
		Area miArea= new Area();
		Integer lado=7;
		float areaEsperada=49;
		
		float areaObtenida=miArea.AreaCuadrado(lado);
		
		Assert.assertEquals(areaEsperada,areaObtenida,0.1);
		
		miArea=null;
		
	}
	
	@Test
	
	public void testAreaCirculo()
	{
		Area miArea=new Area();
		Integer radio=3;
		float areaEsperada=28.26F;
		
		float areaObtenida=miArea.AreaCirculo(radio);
		
		Assert.assertEquals(areaEsperada,areaObtenida,0.1);
		
		miArea=null;
		
	}
	
}
