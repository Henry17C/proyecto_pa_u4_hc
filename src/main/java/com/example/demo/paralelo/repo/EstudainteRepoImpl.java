package com.example.demo.paralelo.repo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.example.demo.paralelo.Estudiante;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository 
@Transactional
public class EstudainteRepoImpl implements IEstudinateRepo {

	@PersistenceContext
	private EntityManager entityManager;
	
	
	@Override
	public void insertar(Estudiante estudiante) {
		// TODO Auto-generated method stub
		
		entityManager.persist(estudiante);
		
	}
	
	
	
	

}
