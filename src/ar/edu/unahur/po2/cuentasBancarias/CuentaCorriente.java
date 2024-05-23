package ar.edu.unahur.po2.cuentasBancarias;

public class CuentaCorriente extends CuentaBancaria {
	//private Double saldo = 0.0 ;	
	private static final Double VALOR_COMISION = 1.05 ;
	private Double deuda = 0.0;
	private Double adicional = 100.0;
	
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
			this.saldo -= cantidad;
		} else if(this.saldo <= cantidad && this.adicional > 0) {
			this.deuda += ((cantidad - this.saldo) * VALOR_COMISION);
			this.saldo -= cantidad;
		//	this.adicional -= deuda;
		}
	}

	public Double getDeuda() {
		return this.deuda;
	}
	

}
