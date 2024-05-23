package ar.edu.unahur.po2.cuentasBancarias;

public abstract class CuentaBancaria {
	protected Double saldo = 0.0 ;
	
	
	public Double getSaldo() {
		return this.saldo;
	}
	
	public Double depositar(Double cantidad) {
		return this.saldo += cantidad;
	}
	
	protected abstract void extraer(Double cantidad);
}
