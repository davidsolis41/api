package com.ApiRestaurante.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ApiRestaurante.entity.Venta;
import com.ApiRestaurante.repository.VentaRepository;

@Service
public class VentaService {

	@Autowired
	VentaRepository repository;
	
	public Venta guardar(Venta entity) {
		return repository.save(entity);
	}
	
	public boolean borrar(Venta entity) {
		try {
			repository.delete(entity);
			return true;
		} catch(Exception ex) {
			return false;
		}
	}
	
	public boolean borrarPorId(Venta entity) {
		try {
			repository.deleteById(entity.getId());
			return true;
		} catch(Exception ex) {
			return false;
		}
	}
	
	public Venta actualizar(Venta entity) {
		return repository.save(entity);
	}
	
	public Venta consultarPorId(Venta entity) {
		return repository.findById(entity.getId()).orElse(null);
	}
	
	public List<Venta>consultarTodos() {
		return repository.findAll();
	}
}
