package com.montsita.morata.hernandez.api.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.montsita.morata.hernandez.api.app.entity.Cliente;
import com.montsita.morata.hernandez.api.app.service.ClienteService;

@RestController
@RequestMapping("/api")
//pasar una sub-ruta q sirve para que esto lo pasemos a distintas clases:cliente, producto
// esto se pasaria así: localhost:8080/api/cliente;localhost:8080/api/producto/....
public class ClienteRestController {
	@Autowired
	private ClienteService clienteService;
	
	@GetMapping ("/clientes")
	public List<Cliente> index(){
		return clienteService.buscarTodos();
	}
	@GetMapping("/clientes/{id}")
	//@Pathvariable:tomar variable d ruta y la va a capturar y lo va a bajar pr q funcione
	//metodo. Se usa con el tipo. para probarlo: http://localhost:8085/clientes/4
	public Cliente show(@PathVariable Long id) {
		return clienteService.buscarPorId(id);
		
	}
	//para probar el POST, necesito 1 herramienta: POSTMAN
	@PostMapping("/clientes")
	//@RequestBody: anotación pr recibir un modelo cliente, una respuesta
	public Cliente create(@RequestBody Cliente cliente) {
		return clienteService.guardar(cliente);
		
		
	}
}
