package com.example.demo.paralelo;

import java.util.List;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;


@Entity
@Table(name = "estudiante_p")
//principal
public class Estudiante {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_estu")//generarlo como secuencia
	@SequenceGenerator(name = "seq_estu", sequenceName = "seq_estu", allocationSize = 1)
	@Column(name="estu_id")
	private Integer id;
	
	@Column(name="estu_nombre_completo")
	private String nombre;
	
	@Column(name="estu_edad")
	private Integer edad;
	

	@OneToOne
	@JoinColumn(name ="estudiante_ciudadano")
	Ciudadano ciud;


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public Integer getEdad() {
		return edad;
	}


	public void setEdad(Integer edad) {
		this.edad = edad;
	}


	public Ciudadano getCiud() {
		return ciud;
	}


	public void setCiud(Ciudadano ciud) {
		this.ciud = ciud;
	}


	@Override
	public String toString() {
		return "Estudiante [nombre=" + nombre + ", edad=" + edad + "]";
	}
	
	
	

	

}
