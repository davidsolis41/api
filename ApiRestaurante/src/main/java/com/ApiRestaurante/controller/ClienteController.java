package com.ApiRestaurante.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ApiRestaurante.entity.Cliente;
import com.ApiRestaurante.service.ClienteService;

@RestController
@RequestMapping(path = "/api/v1/cliente")
public class ClienteController {

	@Autowired
	ClienteService serviceCliente;
	
	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/guardar", method = RequestMethod.POST, 
			consumes = MediaType.APPLICATION_JSON_VALUE, 
			produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody Cliente guardar(@RequestBody Cliente entity) {
		return serviceCliente.guardar(entity);
	}
	
	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/borrar", method = RequestMethod.DELETE, 
			consumes = MediaType.APPLICATION_JSON_VALUE, 
			produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody boolean borrar(@RequestBody Cliente entity) {
		return serviceCliente.borrar(entity);
	}
	
	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/borrarPorId", method = RequestMethod.DELETE, 
			consumes = MediaType.APPLICATION_JSON_VALUE, 
			produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody boolean borrarPorId(@RequestBody Cliente entity) {
		return serviceCliente.borrarPorId(entity);
	}
	
	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/actualizar", method = RequestMethod.PUT, 
			consumes = MediaType.APPLICATION_JSON_VALUE, 
			produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody Cliente actualizar(@RequestBody Cliente entity) {
		return serviceCliente.actualizar(entity);
	}
	
	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/consultarPorId", method = RequestMethod.GET, 
			consumes = MediaType.APPLICATION_JSON_VALUE, 
			produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody Cliente consultarPorId(@RequestBody Cliente entity) {
		return serviceCliente.consultarPorId(entity);
	}
	
	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/consultarTodos", method = RequestMethod.GET, 
			consumes = MediaType.APPLICATION_JSON_VALUE, 
			produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody List<Cliente> consultarTodos() {
		return serviceCliente.consultarTodos();
	}
}
