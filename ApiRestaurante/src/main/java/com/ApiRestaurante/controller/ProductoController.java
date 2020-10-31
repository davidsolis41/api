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

import com.ApiRestaurante.entity.Producto;
import com.ApiRestaurante.service.ProductoService;

@RestController
@RequestMapping(path = "/api/v1/producto")
public class ProductoController {
	@Autowired
	ProductoService serviceProducto;
	
	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/guardar", method = RequestMethod.POST, 
			consumes = MediaType.APPLICATION_JSON_VALUE, 
			produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody Producto guardar(@RequestBody Producto entity) {
		return serviceProducto.guardar(entity);
	}
	
	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/borrar", method = RequestMethod.DELETE, 
			consumes = MediaType.APPLICATION_JSON_VALUE, 
			produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody boolean borrar(@RequestBody Producto entity) {
		return serviceProducto.borrar(entity);
	}
	
	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/borrarPorId", method = RequestMethod.DELETE, 
			consumes = MediaType.APPLICATION_JSON_VALUE, 
			produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody boolean borrarPorId(@RequestBody Producto entity) {
		return serviceProducto.borrarPorId(entity);
	}
	
	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/actualizar", method = RequestMethod.PUT, 
			consumes = MediaType.APPLICATION_JSON_VALUE, 
			produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody Producto actualizar(@RequestBody Producto entity) {
		return serviceProducto.actualizar(entity);
	}
	
	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/consultarPorId", method = RequestMethod.GET, 
			consumes = MediaType.APPLICATION_JSON_VALUE, 
			produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody Producto consultarPorId(@RequestBody Producto entity) {
		return serviceProducto.consultarPorId(entity);
	}
	
	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/consultarTodos", method = RequestMethod.GET, 
			consumes = MediaType.APPLICATION_JSON_VALUE, 
			produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody List<Producto> consultarTodos() {
		return serviceProducto.consultarTodos();
	}
}
