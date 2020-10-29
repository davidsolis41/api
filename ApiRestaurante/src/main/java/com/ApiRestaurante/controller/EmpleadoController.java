package com.ApiRestaurante.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ApiRestaurante.entity.Empleado;
import com.ApiRestaurante.service.EmpleadoService;

@RestController
@RequestMapping(path = "/api/v1/empleado")
public class EmpleadoController {


	@Autowired
	EmpleadoService serviceEmpleado;
	
	@RequestMapping(value = "/guardar", method = RequestMethod.POST, 
			consumes = MediaType.APPLICATION_JSON_VALUE, 
			produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody Empleado guardar(@RequestBody Empleado entity) {
		return serviceEmpleado.guardar(entity);
	}
	
	@RequestMapping(value = "/borrar", method = RequestMethod.DELETE, 
			consumes = MediaType.APPLICATION_JSON_VALUE, 
			produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody boolean borrar(@RequestBody Empleado entity) {
		return serviceEmpleado.borrar(entity);
	}
	
	@RequestMapping(value = "/borrarPorId", method = RequestMethod.DELETE, 
			consumes = MediaType.APPLICATION_JSON_VALUE, 
			produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody boolean borrarPorId(@RequestBody Empleado entity) {
		return serviceEmpleado.borrarPorId(entity);
	}
	
	@RequestMapping(value = "/actualizar", method = RequestMethod.PUT, 
			consumes = MediaType.APPLICATION_JSON_VALUE, 
			produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody Empleado actualizar(@RequestBody Empleado entity) {
		return serviceEmpleado.actualizar(entity);
	}
	
	@RequestMapping(value = "/consultarPorId", method = RequestMethod.GET, 
			consumes = MediaType.APPLICATION_JSON_VALUE, 
			produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody Empleado consultarPorId(@RequestBody Empleado entity) {
		return serviceEmpleado.consultarPorId(entity);
	}
	
	@RequestMapping(value = "/consultarTodos", method = RequestMethod.GET, 
			consumes = MediaType.APPLICATION_JSON_VALUE, 
			produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody List<Empleado> consultarTodos() {
		return serviceEmpleado.consultarTodos();
	}
}
