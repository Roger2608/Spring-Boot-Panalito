package com.panalito.services;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.panalito.entities.Cliente;
import com.panalito.entities.Empleado;
import com.panalito.entities.Venta;
import com.panalito.repositorys.VentaRepository;

@Service
public class VentaServices {

	@Autowired
	private VentaRepository vr;

	public void crear(Venta t) {
		vr.save(t);
	}

	public List<Venta> mostrar() {
		return vr.findAll();
	}

	public List<Venta> buscarPorCliente(Cliente t) {
		return vr.findByCliente(t);
	}

	public List<Venta> buscarPorEmpleado(Empleado t) {
		return vr.findByEmpleado(t);
	}
//	
//	public List<Venta> buscarPorEmpleado(Empleado t) {
//		return vr.findByEmpleado(t.getId());
//	}
//
	public List<Venta> buscarPorFecha(LocalDate date) {
		return vr.findByDate(date);
	}

	public Optional<Venta> buscarPorId(int id) {
		return vr.findById(id);
	}

	public void actualizar(Venta t) {
		vr.update(t.getEstado(), t.getId());
	}

}
