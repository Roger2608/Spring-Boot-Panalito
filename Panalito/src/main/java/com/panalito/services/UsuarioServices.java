package com.panalito.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.panalito.entities.Empleado;
import com.panalito.entities.Usuario;
import com.panalito.repositorys.UsuarioRepository;

@Service
public class UsuarioServices {

	@Autowired
	private UsuarioRepository ur;
	
	
	public void crear(Usuario t) {
		ur.save(t);
	}

	
	public List<Usuario> mostrar() {
		return ur.findAll();
	}

	
	public Usuario buscarPorEmpleado(Empleado t) {
		return ur.findByEmpleado(t);
	}

	
	public void eliminar(int id) {
		ur.deleteById(id);
	}

	
	public void actualizar(Usuario t) {
		ur.update(t.getUsuario(), t.getContraseña(),t.getId());
	}
	
	public Empleado validar(String usuario, String contraseña) {
		return ur.login(usuario, contraseña).getEmpleado();
	}
	
}
