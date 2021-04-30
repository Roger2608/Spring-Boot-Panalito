package com.panalito.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.panalito.services.EmpleadoServices;
import com.panalito.services.UsuarioServices;

@Controller
public class DireccionadorController {
	@Autowired
	UsuarioServices us;
	
	@Autowired
	EmpleadoServices es;
	
	@GetMapping({"/" ,"/inicio"})
	public String inicio() {
		return "index";
	}
	
	@GetMapping("/miel")
	public String miel() {
		return "miel";
	}
	
	@GetMapping("/algarrobina")
	public String algarrobina() {
		return "algarrobina";
	}
	
	@GetMapping("/polen")
	public String polen() {
		return "polen";
	}
	
	@PostMapping("/login")
	public String login(@RequestParam(value = "txtUsuario") String usuario, @RequestParam(value = "txtContrasena") String contraseña){
		String direccion;
		if(es.buscarPorId(us.validar(usuario, contraseña).getId())!= null) {
			direccion = "algarrobina";
		}else {
			direccion = "index";
		}
		return direccion;
	}
	
	@PostMapping("/realizarPedido")
	public String login(@RequestParam(value = "txtNombre") String nombre, @RequestParam(value = "txtApellido") String apellido, 
			@RequestParam(value = "txtTelefono") String telefono) {
		return "index";
	}
	
}
