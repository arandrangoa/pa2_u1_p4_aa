package com.example.demo.banco.modelo;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Transferencia {
	
	private String numero;
	
	private BigDecimal monto;
	
	private LocalDate fecha;
	
	private CuentaBancaria cuentaOrigen;
	
	private CuentaBancaria cuentaDesrtino;
	
	//SET Y GET

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public BigDecimal getMonto() {
		return monto;
	}

	public void setMonto(BigDecimal monto) {
		this.monto = monto;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public CuentaBancaria getCuentaOrigen() {
		return cuentaOrigen;
	}

	public void setCuentaOrigen(CuentaBancaria cuentaOrigen) {
		this.cuentaOrigen = cuentaOrigen;
	}

	public CuentaBancaria getCuentaDesrtino() {
		return cuentaDesrtino;
	}

	public void setCuentaDesrtino(CuentaBancaria cuentaDesrtino) {
		this.cuentaDesrtino = cuentaDesrtino;
	}

	@Override
	public String toString() {
		return "Transferencia [numero=" + numero + ", monto=" + monto + ", fecha=" + fecha + ", cuentaOrigen="
				+ cuentaOrigen + ", cuentaDesrtino=" + cuentaDesrtino + "]";
	}
	
	
	

}
