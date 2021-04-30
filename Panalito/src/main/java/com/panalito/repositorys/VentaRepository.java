package com.panalito.repositorys;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.panalito.entities.Cliente;
import com.panalito.entities.Empleado;
import com.panalito.entities.Venta;
import com.panalito.util.TipoEstado;

@Repository
public interface VentaRepository extends JpaRepository<Venta, Integer> {

	@Query("Select v from Venta v where v.cliente = ?1")
	List<Venta> findByCliente(Cliente t);

	@Query("Select v from Venta v where v.empleado = ?1")
	List<Venta> findByEmpleado(Empleado t);
	
//	@Query("Select v from Venta v where v.Id_empleado = ?1")
//	List<Venta> findByEmpleado(int id);

	@Query("Select v from Venta v where v.fecha = ?1")
	List<Venta> findByDate(LocalDate date);

	@Query("update Venta v set v.estado = ?1 where v.id = ?2") //
	void update(TipoEstado estado, int id);
}
