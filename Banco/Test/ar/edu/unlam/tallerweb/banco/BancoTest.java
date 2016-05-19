package ar.edu.unlam.tallerweb.banco;

import org.junit.Assert;
import org.junit.Test;

public class BancoTest {
	
	
	@Test(expected=Exception.class)
	public void testSaldo() throws Exception{
		Banco nuevaCuenta = new Banco();
		cuenta miCuenta =new cuenta();
		
			nuevaCuenta.consultaSaldo(miCuenta);
		
	}
	
	@Test(expected=Exception.class)
	public void testDeposito()throws Exception {
		Banco nuevaCuenta = new Banco();
		cuenta miCuenta =new cuenta();
		Assert.assertTrue(nuevaCuenta.deposito(miCuenta, (float)-1500.00));
		
	}
	@Test(expected=Exception.class)
	public void testExtraccion() throws Exception{
		Banco nuevaCuenta = new Banco();
		cuenta miCuenta =new cuenta();
		Assert.assertTrue(nuevaCuenta.extraccion(miCuenta, (float)-0.001));
		
	}

}
