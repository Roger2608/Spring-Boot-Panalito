package com.panalito.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.panalito.entities.Cliente;
import com.panalito.entities.Distrito;
import com.panalito.repositorys.ClienteRepository;


@Service
public class ClienteServices {
	
	@Autowired
	private ClienteRepository cr;
	
	
	public void crear(Cliente t) {
		cr.save(t);
	}
	
	
	public List<Cliente> mostrar(){
		return cr.findAll();
	}
	
	
	public Cliente buscarPorNombre(String nombre, String apellido) {
		return cr.findByName(nombre, apellido);
	}
	
	
	public Optional<Cliente> buscarPorId(int id) {
		return cr.findById(id);
	}
	
	
	public List<Cliente> buscarPorDistrito(Distrito d){
		return cr.findByDistrito(d);
	}
	
	
	public void eliminar(int id) {
		cr.deleteById(id);
	}
	
	
	public void actualizar(Cliente t) {
		cr.update(t.getNombre(), t.getApellido(), t.getTelefono(), t.getDireccion(), t.getDistrito(), t.getId());
	}
	
}
