package com.montsita.morata.hernandez.api.app.service;

import java.util.List;

import com.montsita.morata.hernandez.api.app.entity.Cliente;

public interface ClienteService {
	//met abstractos pr devolver todos los clientes
	public List<Cliente> buscarTodos();
	
	//metodo q devuelve un cliente x id
	public Cliente buscarPorId(Long id);
	
	
	//met abst pr registrar un cliente
	public Cliente guardar(Cliente cliente);
	

	
		
}
