package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import conversor.ConversorTemperatura;

/**
 * @author Eduardo Vital
 * 
 */
public class ConversorTemperaturaTest {

	ConversorTemperatura meuConversor;
	
	@Before
	public void setUp() throws Exception {
		meuConversor = new ConversorTemperatura();
	}

	@Test
	public void testCelsiusParaFahrenheit() {
		assertEquals(104, meuConversor.celsiusParaFahrenheit());
	}

	@Test
	public void testCelsiusParaFahrenheitInt() {
		assertEquals(248, meuConversor.celsiusParaFahrenheit(120));
	}

	@Test
	public void testCelsiusParaFahrenheitDouble() {
		assertEquals(248, meuConversor.celsiusParaFahrenheit(120));
	}

	@Test
	public void testCelsiusParaKelvin() {
		assertEquals(393.15, meuConversor.celsiusParaKelvin(120),0.01);
	}

	@Test
	public void testFahrenheitParaCelsius() {
		assertEquals(48.88, meuConversor.fahrenheitParaCelsius(120),0.01);
	}

	@Test
	public void testFahrenheitParaKelvin() {
		assertEquals(322.03, meuConversor.fahrenheitParaKelvin(120),0.01);
	}

	@Test
	public void testKelvinParaCelsius() {
		assertEquals(-153.15, meuConversor.kelvinParaCelsius(120),0.01);
	}

	@Test
	public void testKelvinParaFahrenheit() {
		assertEquals(-243.67, meuConversor.kelvinParaFahrenheit(120),0.01);
	}

}

