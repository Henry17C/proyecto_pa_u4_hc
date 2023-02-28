package com.example.demo.paralelo.service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.paralelo.Ciudadano;
import com.example.demo.paralelo.Estudiante;
import com.example.demo.paralelo.repo.ICiudadanoRepo;
import com.example.demo.paralelo.repo.IEstudinateRepo;
import com.example.demo.paralelo.service.ICuidadanoService;

@Service
public class CiudadanoServiceImpl implements ICuidadanoService {

	@Autowired
	private ICiudadanoRepo cuidadanoRepo;
	@Autowired
	private IEstudinateRepo estudinateRepo;

	@Override
	public List<Ciudadano> consultarTodos() {
		// TODO Auto-generated method stub
		return cuidadanoRepo.consultarTodos();
	}

	@Override
	public Estudiante convertir(Ciudadano ciudadano) {
		Estudiante estudiante = new Estudiante();
		String nombreCompleto = ciudadano.getApellido() + ciudadano.getNombre();

		Integer edad = LocalDateTime.now().getYear() - ciudadano.getFecha().getYear();

		estudiante.setEdad(edad);
		estudiante.setNombre(nombreCompleto);

		estudinateRepo.insertar(estudiante);

		return estudiante;
	}

	@Override
	public void procesarEstudianteParalelo() {
		long tiempoInicial = System.currentTimeMillis();
		List<Ciudadano> lis = consultarTodos();
		List<Estudiante> listaEstu = lis.parallelStream().map(ciud -> convertir(ciud)).collect(Collectors.toList());
		System.out.println(listaEstu+"hilo "+Thread.currentThread().getName());
		long tiempoFinal = System.currentTimeMillis();
		long tiempoTranscurrido = (tiempoFinal - tiempoInicial) / 1000;System.out.println("Tiempo transcurrido en segundos: " + tiempoTranscurrido);
		}

}
