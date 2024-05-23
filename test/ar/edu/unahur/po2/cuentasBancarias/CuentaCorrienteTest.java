package ar.edu.unahur.po2.cuentasBancarias;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CuentaCorrienteTest {


	@Test
	void queSeCreeUnaCuentaSueldoQueSepaSuValor() {
		CuentaCorriente Corriente = new CuentaCorriente(); 
		Double valorEsperado = 0.0;
		Double valorObtenido = Corriente.getSaldo();
			
		assertEquals(valorEsperado,valorObtenido);
	}
	
	@Test
	void queSePuedaDepositarDineroDeLaCuenta(){
		CuentaCorriente Corriente = new CuentaCorriente();
		Double valorEsperado = 100.0;
		Corriente.depositar(100.00);
		Double valorObtenido = Corriente.getSaldo();
		assertEquals(valorEsperado,valorObtenido);
	}
	
	
	@Test 
	void queAlRetirarUnMontoQueNoHayEnLaCuentaSeAdicione() {
		CuentaCorriente Corriente = new CuentaCorriente();
		Double valorEsperado = 105.0;
		Corriente.depositar(100.00);
		Corriente.extraer(200.00);
		Double valorObtenido = Corriente.getDeuda();
		assertEquals(valorEsperado,valorObtenido);
	}
	
}
