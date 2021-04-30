package com.panalito.entities;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.panalito.util.TipoEstado;
import static com.panalito.util.Util.*;

/**
 *
 * @author 15-AX222LA
 */
@Entity
@Table(name = "venta", catalog = "ventas2020")
public class Venta implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@Basic(optional = false)
	@Column(name = "Id_venta")
    private int id;
	@ManyToOne(optional = false, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Cliente cliente;
	@Column(name = "Fecha_venta")
    private LocalDate fecha;
	@Column(name = "Cant_venta")
    private int cantidad;
	@Column(name = "Costo_venta")
    private double costo;
	@Column(name = "Desc_venta",length = 50)
    private String descripcion;
	@Column(name = "Estado_venta",length = 20)
    private TipoEstado estado;
	
	@ManyToOne
    @JoinColumn(name="id", nullable=false)
    private Empleado empleado;

    public Venta() {
    	this.costo = (getCantidad() * (COSTO_PRODUCTO + COSTO_ENVIO));
    }

    public Venta(Cliente cliente, LocalDate fecha, int cantidad, String descripcion, TipoEstado estado, Empleado empleado) {
        this.cliente = cliente;
        this.fecha = fecha;
        this.cantidad = cantidad;
        this.costo = (getCantidad() * (COSTO_PRODUCTO + COSTO_ENVIO));
        this.descripcion = descripcion;
        this.estado = estado;
        this.empleado = empleado;
    }

    public int getId() {
        return id;
    }
    
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    public double getCosto() {
		return costo;
	}
    
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public TipoEstado getEstado() {
        return estado;
    }

    public void setEstado(TipoEstado estado) {
        this.estado = estado;
    }

    public Empleado getEmpleado() {
        return empleado;
    }
    
    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

	@Override
	public String toString() {
		return "Venta [id=" + id + ", cliente=" + cliente + ", fecha=" + fecha + ", cantidad=" + cantidad + ", costo="
				+ costo + ", descripcion=" + descripcion + ", estado=" + estado + ", empleado=" + empleado + "]";
	}
    
    
    
}

