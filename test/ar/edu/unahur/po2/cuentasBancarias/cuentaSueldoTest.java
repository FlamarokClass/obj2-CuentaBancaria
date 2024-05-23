package ar.edu.unahur.po2.cuentasBancarias;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class cuentaSueldoTest {

	@Test
	void queSeCreeUnaCuentaSueldoQueSepaSuValor() {
		CuentaSueldo Sueldo = new CuentaSueldo(); 
		Double valorEsperado = 0.0;
		Double valorObtenido = Sueldo.getSaldo();
			
		assertEquals(valorEsperado,valorObtenido);
	}
	
	@Test
	void queSePuedaDepositarDineroDeLaCuenta(){
		CuentaSueldo Sueldo = new CuentaSueldo();
		Double valorEsperado = 100.0;
		Sueldo.depositar(100.00);
		Double valorObtenido = Sueldo.getSaldo();
		assertEquals(valorEsperado,valorObtenido);
	}
	
	@Test 
	void queNoSePuedaRetirarUnMontoQueNoHayEnLaCuenta() {
		CuentaSueldo Sueldo = new CuentaSueldo();
		Double valorEsperado = 100.0;
		Sueldo.depositar(100.00);
		Sueldo.extraer(200.00);
		Double valorObtenido = Sueldo.getSaldo();
		assertEquals(valorEsperado,valorObtenido);
		
	}

}



