package com.example.demo.paralelo;

import java.time.LocalDateTime;
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
@Table(name = "ciudadano_p")
//principal
public class Ciudadano {

	@Id
	
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ciud_seq")//generarlo como secuencia
	@SequenceGenerator(name = "seq_ciud", sequenceName = "ciud_seq", allocationSize = 1)
	@Column(name="ciud_id")
	private Integer id;
	
	@Column(name="ciud_nombre")
	private String nombre;
	
	@Column(name="ciud_apellido")
	private String apellido;
	
	@Column(name="ciud_fecha_nacimiento")
	private LocalDateTime fecha;
	
	

	
	
	

	

}
