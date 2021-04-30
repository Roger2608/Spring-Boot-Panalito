package com.panalito.repositorys;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.panalito.entities.Cliente;
import com.panalito.entities.Distrito;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer>{
	

	@Query("Select c from Cliente c where c.nombre = ?1 and c.apellido = ?2")
	Cliente findByName(String nombre, String apellido);
	
	@Query("Select c from Cliente c where c.distrito = ?1")
	List<Cliente> findByDistrito(Distrito d);
	
//	@Query("Select c from Cliente c where c.Id_distrito = ?1")
//	List<Cliente> findByDistrito(String id);
	
	@Query("update Cliente c set c.nombre = ?1, c.apellido = ?2, c.telefono = ?3, c.direccion = ?4, c.distrito = ?5 where c.id = ?6")
	void update(String nombre,String apellido, String telefono, String direccion, Distrito distrito, int id);
	
//	@Query("update Cliente c set c.nom_cliente = ?1, c.ape_cliente = ?2, c.tel_cliente = ?3, c.dir_cliente = ?4, c.Id_distrito = ?5 where c.Id_cliente = ?6")
//	void update(String nombre,String apellido, String telefono, String direccion, String idD, int id);
	
}
