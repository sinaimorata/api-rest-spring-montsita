package com.montsita.morata.hernandez.api.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.yaml.snakeyaml.events.Event.ID;

import com.montsita.morata.hernandez.api.app.entity.Cliente;

@Repository
public interface ClienteRepository<T> extends CrudRepository<Cliente,Long> {
	//En repository,puedo usar métodos jpa q con solo poner la palabra, me da el
	//el resto del cuerpo de dicho méto.Ej.: finBy...luego implementarlo en imp y direccin
	//en controller
	List<Cliente> findByNombre(String nombre);
	
	@Query("select c from Cliente c where c.apellido = ?1")
	List<Cliente> findByApellido(String apellido);
}
