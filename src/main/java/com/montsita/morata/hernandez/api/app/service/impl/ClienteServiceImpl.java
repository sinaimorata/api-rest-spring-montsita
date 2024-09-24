package com.montsita.morata.hernandez.api.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.montsita.morata.hernandez.api.app.entity.Cliente;
import com.montsita.morata.hernandez.api.app.repository.ClienteRepository;
import com.montsita.morata.hernandez.api.app.service.ClienteService;
@Service
public class ClienteServiceImpl implements ClienteService {
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	//devuelve datos, registra y busca x id gracias al CrudRepository q tiene todos los mét. hechos.
	
	@Override
	@Transactional(readOnly = true)
	public List<Cliente> buscarTodos() {
	
		return (List<Cliente>) clienteRepository.findAll();
	}

	@Override
	@Transactional
	public Cliente guardar(Cliente cliente) {
		return (Cliente) clienteRepository.save(cliente);
		
	}

	@Override
	@Transactional(readOnly = true)
	public Cliente buscarPorId(Long id) {
		
		return (Cliente) clienteRepository.findById(id).orElse(null);
	}

}
