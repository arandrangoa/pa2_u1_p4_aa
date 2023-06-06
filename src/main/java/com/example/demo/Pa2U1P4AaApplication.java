package com.example.demo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.banco.modelo.Cajero;
import com.example.demo.banco.modelo.Impuesto;
import com.example.demo.banco.modelo.Presidente;
import com.example.demo.banco.modelo.Transferencia;
import com.example.demo.banco.service.ICargaSistemaService;
import com.example.demo.banco.service.TransferenciaService;


@SpringBootApplication
public class Pa2U1P4AaApplication implements CommandLineRunner{
	
	@Autowired
	private Cajero cajero;

	@Autowired
	private Cajero cajero1;
	
	@Autowired
	private Presidente presidente; 
	
	@Autowired
	private Presidente presidente1; 
	
	@Autowired
	private ICargaSistemaService cargaSistemaService;
	
	@Autowired
	private Impuesto impuesto;
	
	@Autowired
	private TransferenciaService transervice;

	public static void main(String[] args) {
		SpringApplication.run(Pa2U1P4AaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		this.cajero.setApellido("Andrango");
		this.cajero.setNombre("Alex");
		this.cajero.setSalario(new BigDecimal(100));
		System.out.println(this.cajero);
		this.cajero1.setApellido("Mullo");
		System.out.println(this.cajero1);	
		System.out.println(this.cajero1.getApellido());
		
		
		this.presidente.setApellido("Porras");
		this.presidente.setNombre("Andrea");
		this.presidente.setCedula("cedula");
		this.presidente1.setApellido("Taco");
		
		System.out.println(this.presidente);
		System.out.println(this.presidente1);
		
		System.out.println("**********SEGUNDA PARTE**************");
		this.cargaSistemaService.cargar();
		System.out.println(this.impuesto);
		
		
		
		Transferencia trans=new Transferencia();
		trans.setCuentaDesrtino(null);
		trans.setCuentaOrigen(null);
		trans.setFecha(LocalDateTime.now());
		trans.setMonto(new BigDecimal(100));
		trans.setNumero("123456");
		this.transervice.agregar(trans);
		
	}
}


