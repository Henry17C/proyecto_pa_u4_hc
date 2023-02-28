package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.paralelo.Ciudadano;

import com.example.demo.paralelo.service.ICuidadanoService;

@SpringBootApplication
public class ProyectoPaU4HcApplication  implements CommandLineRunner{

	
	@Autowired 
	ICuidadanoService ciudadanoService;
	public static void main(String[] args) {
		SpringApplication.run(ProyectoPaU4HcApplication.class, args);
		
		
	
		
		
	}

	@Override
	public void run(String... args) throws Exception {
		
		
		// Imprimir todos los Cidadanos
		System.out.println("hola");
		
		List <Ciudadano> ciu= ciudadanoService.consultarTodos();
		
		
		
		for (Ciudadano ciudadano : ciu) {
			System.out.println(ciu);
		}

		System.out.println(ciu.size());
		
		
		//Convertir un ciudadano a Estudiante
		
		Ciudadano ciud=ciu.get(1);
	System.out.println(ciudadanoService.convertir(ciud));	
	
	
		
	
	//Convertir un ciudadano a Estudiante
		
		
	ciudadanoService.procesarEstudianteParalelo();
		
		
		
		
		
		
	}

}
