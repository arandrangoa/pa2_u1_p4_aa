package com.example.demo;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Pa2U1P4AaApplication implements CommandLineRunner{
	
	@Autowired
	private Profesor prof2;
	

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
		prof.setFechaNacimiento(LocalDateTime.of(1999, 11, 21, 0, 0));	
		
		System.out.println(prof);
		System.out.println(prof.getApellido());
		
		System.out.println(prof2);
		prof2.setApellido("Teran");
		System.out.println(prof2.getApellido());
		
		Profesor prof3;
		prof3=prof;
		System.out.println(prof3);
		prof.setApellido("Mullo");
		System.out.println(prof3);
		
		
		
		MatriculaCalculo mat=new MatriculaCalculo();
		mat.realizarMatricula("1");
	}

}

