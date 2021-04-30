package com.panalito.entities;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author 15-AX222LA
 * @param <Venta>
 */
@Entity
@Table(name = "empleado", catalog = "ventas2020")
public class Empleado implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@Basic(optional = false)
	@Column(name = "Id_empleado")
    private int id;
	@Column(name = "nom_empleado", length = 25)
    private String nombre;
	@Column(name = "ape_empleado", length = 25)
    private String apellido;
	@Column(name = "dni_empleado", length = 8)
    private String dni;
	@Column(name = "tel_empleado", length = 9)
    private String telefono;
	@Column(name = "correo_empleado", length = 30)
    private String correo;
	@Column(name = "tipo_empleado", length = 10)
    private String tipo;
	@Column(name = "sueldo_empleado")
    private int sueldo;
	
	@OneToMany(mappedBy = "empleado")
	private Set<Venta> ventas;
	
	
    public Empleado() {
    }

    public Empleado(int id, String nombre, String apellido, String dni, String telefono, String correo, String tipo,
			int sueldo) {
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.telefono = telefono;
		this.correo = correo;
		this.tipo = tipo;
		this.sueldo = sueldo;
	}



	public int getId() {
        return id;
    }
    
    public void setId(int id) {
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

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getSueldo() {
        return sueldo;
    }
    
    public void setSueldo(int sueldo) {
		this.sueldo = sueldo;
	}

	@Override
	public String toString() {
		return "Empleado [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + ", telefono="
				+ telefono + ", correo=" + correo + ", tipo=" + tipo + ", sueldo=" + sueldo + "]";
	}
    
    
    
}

