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

import com.ApiRestaurante.entity.Venta;
import com.ApiRestaurante.service.VentaService;

@RestController
@RequestMapping(path = "/api/v1/venta")
public class VentaController {

	@Autowired
	VentaService serviceVenta;
	
	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/guardar", method = RequestMethod.POST, 
			consumes = MediaType.APPLICATION_JSON_VALUE, 
			produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody Venta guardar(@RequestBody Venta entity) {
		return serviceVenta.guardar(entity);
	}
	
	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/borrar", method = RequestMethod.DELETE, 
			consumes = MediaType.APPLICATION_JSON_VALUE, 
			produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody boolean borrar(@RequestBody Venta entity) {
		return serviceVenta.borrar(entity);
	}
	
	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/borrarPorId", method = RequestMethod.DELETE, 
			consumes = MediaType.APPLICATION_JSON_VALUE, 
			produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody boolean borrarPorId(@RequestBody Venta entity) {
		return serviceVenta.borrarPorId(entity);
	}
	
	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/actualizar", method = RequestMethod.PUT, 
			consumes = MediaType.APPLICATION_JSON_VALUE, 
			produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody Venta actualizar(@RequestBody Venta entity) {
		return serviceVenta.actualizar(entity);
	}
	
	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/consultarPorId", method = RequestMethod.GET, 
			consumes = MediaType.APPLICATION_JSON_VALUE, 
			produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody Venta consultarPorId(@RequestBody Venta entity) {
		return serviceVenta.consultarPorId(entity);
	}
	
	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/consultarTodos", method = RequestMethod.GET, 
			consumes = MediaType.APPLICATION_JSON_VALUE, 
			produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody List<Venta> consultarTodos() {
		return serviceVenta.consultarTodos();
	}
}
