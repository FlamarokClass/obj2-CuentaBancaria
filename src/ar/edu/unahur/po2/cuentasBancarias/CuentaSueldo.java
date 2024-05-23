package ar.edu.unahur.po2.cuentasBancarias;

public class CuentaSueldo extends CuentaBancaria {
	//private Double saldo = 0.0 ;

/*
	public Double getSaldo() {
		return this.saldo;
	}
	
	public Double depositar(Double cantidad) {
		return this.saldo += cantidad;
	}
*/
	
	@Override
	protected void extraer(Double cantidad) {
		if(this.saldo >= cantidad) {
			this.saldo =-cantidad;
		}
	}
	
}
