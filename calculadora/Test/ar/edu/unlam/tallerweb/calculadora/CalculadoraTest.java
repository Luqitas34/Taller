package ar.edu.unlam.tallerweb.calculadora;


import org.junit.Test;




public class CalculadoraTest {
		
	@Test
	public void testsuma() {
		Calculadora miSuma= new Calculadora();
		Integer a;
		Integer b;
		a=5;
		b=8;
		miSuma.Sumar(a, b);
		
		
	}
	@Test
	public void testmulti() {
		Calculadora miMulti= new Calculadora();
		Integer a;
		Integer b;
		a=4;
		b=1;
		miMulti.multiplicar(a, b);
		
		
	}
	
	@Test
	public void resultado() {
		Calculadora miResult= new Calculadora();
		miResult.resultado();
		
	}
	
}