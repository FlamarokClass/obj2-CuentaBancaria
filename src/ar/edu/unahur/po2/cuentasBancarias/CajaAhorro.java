package ar.edu.unahur.po2.cuentasBancarias;

public class CajaAhorro extends CuentaBancaria {
	// private Double saldo = 0.0 ;
	private Integer extraccion = 0;
	private static final Double VALOR_COMISION = 6.0 ;

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
		if(this.extraccion <5 && this.saldo >= cantidad) {
			this.saldo -= cantidad ;
			this.extraccion += 1;
		} else if(this.extraccion >= 5 && this.saldo >= cantidad + VALOR_COMISION) {
			this.saldo -= (cantidad + VALOR_COMISION);
			this.extraccion += 1;
		}
	}

}

