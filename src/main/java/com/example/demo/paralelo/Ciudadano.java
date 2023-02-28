package com.example.demo.paralelo;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;


@Entity
@Table(name = "ciudadano_p")
//principal
public class Ciudadano {

	@Id
	
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_ciud")//generarlo como secuencia
	@SequenceGenerator(name = "seq_ciud", sequenceName = "seq_ciud", allocationSize = 1)
	@Column(name="ciud_id")
	private Integer id;
	
	@Column(name="ciud_nombre")
	private String nombre;
	
	@Column(name="ciud_apellido")
	private String apellido;
	
	@Column(name="ciud_fecha_nacimiento")
	private LocalDateTime fecha;
	
	@OneToOne(mappedBy = "ciud")
	Estudiante estu;

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

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	public LocalDateTime getFecha() {
		return fecha;
	}

	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}

	public Estudiante getEstu() {
		return estu;
	}

	public void setEstu(Estudiante estu) {
		this.estu = estu;
	}

	@Override
	public String toString() {
		return "Ciudadano [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", fecha=" + fecha +  "]";
	}
	
	
	

	
	
	

	

}
