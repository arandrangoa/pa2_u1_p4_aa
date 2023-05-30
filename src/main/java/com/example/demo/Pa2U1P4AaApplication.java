package com.example.demo;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.banco.modelo.CuentaBancaria;
import com.example.demo.banco.service.CuentaBancariaService;
import com.example.demo.banco.service.TransferenciaService;
import com.example.demo.modelo.Estudiante;
import com.example.demo.service.EstudianteService;

@SpringBootApplication
public class Pa2U1P4AaApplication implements CommandLineRunner{
	
	@Autowired
	private CuentaBancariaService bancariaService;
	
	@Autowired
	private TransferenciaService transferenciaService;
	

	public static void main(String[] args) {
		SpringApplication.run(Pa2U1P4AaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		//Cuenta1
		CuentaBancaria cuenta1=new CuentaBancaria();
		cuenta1.setCedulaPropietario("1727193847");
		cuenta1.setFechaApertura(LocalDate.now());
		cuenta1.setNumero("1915");
		cuenta1.setSaldo(new BigDecimal(200));
		cuenta1.setTipo("A");
		this.bancariaService.agregar(cuenta1);
		
		//Cuenta2
		CuentaBancaria cuenta2=new CuentaBancaria();
		cuenta2.setCedulaPropietario("1714458237");
		cuenta2.setFechaApertura(LocalDate.now());
		cuenta2.setNumero("1714");
		cuenta2.setSaldo(new BigDecimal(100));
		cuenta2.setTipo("A");
		this.bancariaService.agregar(cuenta2);
		
		this.transferenciaService.realizar(cuenta1.getNumero(), cuenta2.getNumero(), new BigDecimal(10));

		System.out.println("Saldo origen: "+this.bancariaService.buscarPorNumero(cuenta1.getNumero()).getSaldo());
		
		System.out.println("Saldo origen: "+this.bancariaService.buscarPorNumero(cuenta2.getNumero()).getSaldo());


	}

}
