package com.example.demo;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.modelo.Estudiante;
import com.example.demo.service.EstudianteService;

@SpringBootApplication
public class Pa2U1P4AaApplication implements CommandLineRunner{
	
	@Autowired
	private EstudianteService estudianteService;
	
	
	

	public static void main(String[] args) {
		SpringApplication.run(Pa2U1P4AaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
	//1.Guardar
	Estudiante MiEstu=new Estudiante();
	MiEstu.setNombre("Alex");
	MiEstu.setApellido("Andrango");
	MiEstu.setNumeroCedula("1727193847");
	MiEstu.setFechaNacimiento(LocalDateTime.of(1999, 11, 21, 1, 50));
	
	this.estudianteService.crear(MiEstu);
	
	Estudiante MiEstu2=new Estudiante();
	MiEstu2.setNombre("Bryan");
	MiEstu2.setApellido("Mullo");
	MiEstu2.setNumeroCedula("1714458237");
	MiEstu2.setFechaNacimiento(LocalDateTime.of(1998, 06, 18, 5, 30));
	
	this.estudianteService.crear(MiEstu2);
	
	
	
	
	//5.Imprimir reporte
	List<Estudiante> reporte=this.estudianteService.reporteDeTodos();
	System.out.println("Reporte 1 de todos los estudiantes");
	for(Estudiante estu1:reporte) {
		System.out.println(estu1);
	}	
	
	//2.actualizar
	MiEstu2.setApellido("Tuquerres");
	this.estudianteService.actualizar(MiEstu2);
	
	List<Estudiante> reporte2=this.estudianteService.reporteDeTodos();
	System.out.println("Reporte 2 de todos los estudiantes");
	for(Estudiante estu1:reporte2) {
		System.out.println(estu1);
	}
	
	//3.Eliminar
	this.estudianteService.borrar("1727193847");
	
	List<Estudiante> reporte3=this.estudianteService.reporteDeTodos();
	System.out.println("Reporte 3 de todos los estudiantes");
	for(Estudiante estu1:reporte3) {
		System.out.println(estu1);
	}
	
	//4.Buscar por cedula
	Estudiante estudianteEncontrado=this.estudianteService.buscarPorCedula("1714458237");
	System.out.println("Estudiante buscado con cedula");
	System.out.println(estudianteEncontrado);
	
	Estudiante estudianteEncontrado2=this.estudianteService.buscarPorCedula("1713031191");
	System.out.println("Estudiante buscado con cedula");
	System.out.println(estudianteEncontrado2);
	
	}

}
