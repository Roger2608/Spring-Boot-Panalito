package com.panalito.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.panalito.entities.Empleado;
import com.panalito.entities.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Integer>{
	
	@Query("Select u from Usuario u where u.empleado = ?1")
	Usuario findByEmpleado(Empleado t);

//	@Query("Select u from Usuario u where u.Id_empleado = ?1")
//	Usuario findByEmpleado(int id);
	
	@Query("update Usuario u set u.usuario = ?1, u.contraseña =?2 where u.id = ?3")
	void update(String usuario,String contraseña, int id);
	
//	@Query("update Usuario u set u.Usuario = ?1, u.contraseña =?2 where u.Id_usuario = ?3")
//	void update(String usuario,String contraseña, int id);
	
	@Query("Select u from Usuario u where u.usuario = ?1 and u.contraseña = ?2 ")
	Usuario login(String usuario, String contraseña);
	
}
