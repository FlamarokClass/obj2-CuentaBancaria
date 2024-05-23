package ar.edu.unahur.po2.cuentasBancarias;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class cajaAhorroTest {

	@Test
	void queSeCreeUnaCuentaSueldoQueSepaSuValor() {
		CajaAhorro Ahorro = new CajaAhorro(); 
		Double valorEsperado = 0.0;
		Double valorObtenido = Ahorro.getSaldo();
			
		assertEquals(valorEsperado,valorObtenido);
	}
	
	@Test
	void queSePuedaDepositarDineroDeLaCuenta(){
		CajaAhorro Ahorro = new CajaAhorro();
		Double valorEsperado = 100.0;
		Ahorro.depositar(100.00);
		Double valorObtenido = Ahorro.getSaldo();
		assertEquals(valorEsperado,valorObtenido);
	}
	
	@Test 
	void queNoSePuedaRetirarUnMontoQueNoHayEnLaCuenta() {
		CajaAhorro Ahorro = new CajaAhorro();
		Double valorEsperado = 100.0;
		Ahorro.depositar(100.00);
		Ahorro.extraer(200.00);
		Double valorObtenido = Ahorro.getSaldo();
		assertEquals(valorEsperado,valorObtenido);
		
	}
	
	@Test 
	void queDespuesDeLa5taExtraccionCobre6DeRecargo() {
		CajaAhorro Ahorro = new CajaAhorro();
		Ahorro.depositar(100.00);
		Ahorro.extraer(10.00);
		Ahorro.extraer(10.00);
		Ahorro.extraer(10.00);
		Ahorro.extraer(10.00);
		Ahorro.extraer(10.00);
		Ahorro.extraer(10.00);
		Double valorObtenido = Ahorro.getSaldo();
		Double valorEsperado = 34.0;
		assertEquals(valorEsperado,valorObtenido);
		
	}
	
	@Test 
	void queDespuesDeLa5taExtraccionSinFondosParaElRecargoNoExtraiga() {
		CajaAhorro Ahorro = new CajaAhorro();
		Ahorro.depositar(100.00);
		Ahorro.extraer(20.00);
		Ahorro.extraer(20.00);
		Ahorro.extraer(20.00);
		Ahorro.extraer(20.00);
		Ahorro.extraer(10.00);
		Ahorro.extraer(10.00);
		Double valorObtenido = Ahorro.getSaldo();
		Double valorEsperado = 10.0;
		assertEquals(valorEsperado,valorObtenido);
		
	}

}
