package com.ApiRestaurante.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ApiRestaurante.entity.Empleado;
import com.ApiRestaurante.repository.EmpleadoRepository;

@Service
public class EmpleadoService {

	@Autowired
	EmpleadoRepository repository;
	
	public Empleado guardar(Empleado entity) {
		return repository.save(entity);
	}
	
	public boolean borrar(Empleado entity) {
		try {
			repository.delete(entity);
			return true;
		} catch(Exception ex) {
			return false;
		}
	}
	
	public boolean borrarPorId(Empleado entity) {
		try {
			repository.deleteById(entity.getId());
			return true;
		} catch(Exception ex) {
			return false;
		}
	}
	
	public Empleado actualizar(Empleado entity) {
		return repository.save(entity);
	}
	
	public Empleado consultarPorId(Empleado entity) {
		return repository.findById(entity.getId()).orElse(null);
	}
	
	public List<Empleado>consultarTodos() {
		return repository.findAll();
	}
	
}
