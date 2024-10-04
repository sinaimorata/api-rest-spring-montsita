package com.montsita.morata.hernandez.api.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.yaml.snakeyaml.events.Event.ID;

import com.montsita.morata.hernandez.api.app.entity.Cliente;

@Repository
public interface ClienteRepository extends CrudRepository<Cliente,Long> {
	//En repository,puedo usar métodos jpa q con solo poner la palabra, me da el
	//el resto del cuerpo de dicho méto.Ej.: finBy...luego implementarlo en imp y direccin
	//en controller
	List<Cliente> findByNombre(String nombre);
	
	@Query("select c from Cliente c where c.apellido = ?1")
	List<Cliente> findByApellido(String apellido);
	
	//List<Cliente> findByNombreAndApellidos(String nombre, String apellido);
	
	@Query("select c from Cliente c where c.nombre = ?1 and c.apellido = ?2")
	List<Cliente> findByNombreAndApellido(String nombre, String apellido);
	
	//List<Cliente> findByEmailAndTelefono(String email, int telefono);
	
	@Query("select c from Cliente c where c.email = ?1 and c.telefono = ?2")
	List<Cliente> findByEmailAndTelefono2(String email, int telefono);


	
}