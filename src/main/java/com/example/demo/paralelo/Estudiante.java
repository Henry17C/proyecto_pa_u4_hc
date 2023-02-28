package com.example.demo.paralelo;

import java.util.List;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;


@Entity
@Table(name = "estudiante_p")
//principal
public class Estudiante {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "estu_seq")//generarlo como secuencia
	@SequenceGenerator(name = "estu_seq", sequenceName = "estu_seq", allocationSize = 1)
	@Column(name="estu_id")
	private Integer id;
	
	@Column(name="estu_nombre_completo")
	private String nombre;
	
	@Column(name="estu_edad")
	private Integer edad;
	

	
	
	

	

}
