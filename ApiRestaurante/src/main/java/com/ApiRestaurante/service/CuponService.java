package com.ApiRestaurante.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ApiRestaurante.entity.Cupon;
import com.ApiRestaurante.repository.CuponRepository;

@Service
public class CuponService {

	@Autowired
	CuponRepository repository;
	
	public Cupon guardar(Cupon entity) {
		return repository.save(entity);
	}
	
	public boolean borrar(Cupon entity) {
		try {
			repository.delete(entity);
			return true;
		} catch(Exception ex) {
			return false;
		}
	}
	
	public boolean borrarPorId(Cupon entity) {
		try {
			repository.deleteById(entity.getId());
			return true;
		} catch(Exception ex) {
			return false;
		}
	}
	
	public Cupon actualizar(Cupon entity) {
		return repository.save(entity);
	}
	
	public Cupon consultarPorId(Cupon entity) {
		return repository.findById(entity.getId()).orElse(null);
	}
	
	public List<Cupon>consultarTodos() {
		return repository.findAll();
	}
}