package com.example.demo.paralelo.repo;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.paralelo.Ciudadano;


import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class CiudadanoRepoImpl implements ICiudadanoRepo{

	@PersistenceContext
	EntityManager entityManager;
	
	
	@Override
	public List<Ciudadano> consultarTodos() {
		
		
	
		TypedQuery<Ciudadano> query= this.entityManager.createQuery("Select c from Ciudadano c", Ciudadano.class);
		
		return query.getResultList();
	}

	
	
	

}
