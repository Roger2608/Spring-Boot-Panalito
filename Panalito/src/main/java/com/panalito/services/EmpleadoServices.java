package com.panalito.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.panalito.entities.Empleado;
import com.panalito.repositorys.EmpleadoRepository;


@Service
public class EmpleadoServices {
	
	@Autowired
	private EmpleadoRepository er;
	
	
	public void crear(Empleado t) {
		er.save(t);
	}
	
	
	public List<Empleado> mostrar(){
		return er.findAll();
	}
	

	public Empleado buscarPorNombre(String nombre, String apellido) {
		return er.findByName(nombre, apellido);
	}
	

	public Optional<Empleado> buscarPorId(int id) {
		return er.findById(id);
	}
	

	public void eliminar(int id) {
		er.deleteById(id);
	}
	

	public void actualizar(Empleado t) {
		er.update(t.getNombre(), t.getApellido(), t.getDni(), t.getTelefono(), t.getCorreo(), t.getTipo(), t.getId());
	}
	
}
