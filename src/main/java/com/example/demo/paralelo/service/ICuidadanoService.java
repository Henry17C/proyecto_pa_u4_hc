package com.example.demo.paralelo.service;

import java.util.List;

import com.example.demo.paralelo.Ciudadano;
import com.example.demo.paralelo.Estudiante;

public interface ICuidadanoService {
	
	
	public List <Ciudadano> consultarTodos();
	
	public Estudiante convertir(Ciudadano ciudadano);
	
	
	

	public void procesarEstudianteParalelo();
	
	
	
	
	

}
