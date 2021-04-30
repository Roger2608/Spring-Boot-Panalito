package com.panalito.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.panalito.entities.Empleado;

@Repository
public interface EmpleadoRepository extends JpaRepository<Empleado, Integer>{
	
	@Query("Select e from Empleado e where e.nombre = ?1 and e.apellido = ?2")
	Empleado findByName(String nombre, String apellido);
	
	@Query("update Empleado e set e.nombre = ?1, e.apellido = ?2, e.dni = ?3, e.telefono = ?4, e.correo = ?5, e.tipo = ?6 where e.id = ?7")
	void update(String nombre,String apellido,String dni, String telefono, String correo, String tipo, int id);
	
}
