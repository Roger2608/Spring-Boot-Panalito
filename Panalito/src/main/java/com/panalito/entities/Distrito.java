package com.panalito.entities;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Distrito", catalog = "ventas2020")
public class Distrito {
	@Id
	@Basic(optional = false)
	@Column(name = "Id_distrito")
	private String id;
	@Column(name = "Nom_distrito", length = 50)
	private String nombre;

	public Distrito() {
	}

	public Distrito(String id, String nombre) {
		this.id = id;
		this.nombre = nombre;
	}

	public String getId() {
		return id;
	}

	public String getNombre() {
		return nombre;
	}
	
	
	@Override
	public String toString() {
		return "Distrito [id=" + id + ", nombre=" + nombre + "]";
	}

}
