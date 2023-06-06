package com.example.demo.banco.service;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.banco.modelo.Impuesto;
import com.example.demo.banco.repository.IImpuestoRepo;

@Service
public class CargaSistemaServiceImpl implements ICargaSistemaService{
	
	@Autowired
	private Impuesto impuesto;
	
	@Autowired
	private IImpuestoRepo iImpuestoRepo;

	@Override
	public void cargar() {
		// TODO Auto-generated method stub
		System.out.println("Carga de impuestos");
		BigDecimal valorIva=this.iImpuestoRepo.seleccionar("IVA");
		this.impuesto.setIva(valorIva);
		System.out.println("Fin de carga de impuestos");
	}

}
