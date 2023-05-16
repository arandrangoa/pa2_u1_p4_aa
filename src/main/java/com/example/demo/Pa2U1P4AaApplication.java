package com.example.demo;

import java.time.LocalDateTime;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Pa2U1P4AaApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(Pa2U1P4AaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		Profesor prof=new Profesor();
		prof.setApellido("Andrango");
		prof.setCedula("1727193847");
		prof.setNombre("Alex");
		prof.setFechaNacimiento(LocalDateTime.now());
		
		System.out.println(prof);
	}

}

