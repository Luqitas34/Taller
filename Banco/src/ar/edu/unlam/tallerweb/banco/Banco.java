package ar.edu.unlam.tallerweb.banco;

public class Banco {
	

	public Boolean deposito(cuenta miCuenta,Float deposito)throws Exception{
		if(deposito>0)
		{
			System.out.println("saldo anterior:"+miCuenta.saldo);
			miCuenta.saldo=miCuenta.saldo+deposito;
			System.out.println("nuevo saldo:"+miCuenta.saldo);
			return true;
		}
		else
		{
			throw new Exception("no acepta saldo negativo, no se realizo la operacion ");
			
		}
	}
	public Boolean extraccion(cuenta miCuenta,Float extraccion)throws  Exception{
		System.out.println("saldo anterior:"+miCuenta.saldo);
		System.out.println("saldo a descontar:"+extraccion);
		
		if(extraccion>miCuenta.saldo)
		{
			throw new Exception("Saldo insuficiente, reintente");	
			
		}
		else
		{
			miCuenta.saldo=miCuenta.saldo-extraccion;
			System.out.println("nuevo saldo:"+miCuenta.saldo);
			
			return true;
		}
	}
	public void consultaSaldo(cuenta miCuenta)throws Exception{
		if(miCuenta.saldo<0)
		{
			throw new Exception("Saldo negativo:"+miCuenta.saldo);
			
		}
	
			System.out.println("Su saldo es de:"+miCuenta.saldo);
	
	
	}

	
}
