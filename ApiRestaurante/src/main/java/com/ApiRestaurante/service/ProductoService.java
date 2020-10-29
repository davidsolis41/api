package com.ApiRestaurante.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ApiRestaurante.entity.Producto;
import com.ApiRestaurante.repository.ProductoRepository;

@Service
public class ProductoService {
	@Autowired
	ProductoRepository repository;
	
	public Producto guardar(Producto entity) {
		return repository.save(entity);
	}
	
	public boolean borrar(Producto entity) {
		try {
			repository.delete(entity);
			return true;
		} catch(Exception ex) {
			return false;
		}
	}
	
	public boolean borrarPorId(Producto entity) {
		try {
			repository.deleteById(entity.getId());
			return true;
		} catch(Exception ex) {
			return false;
		}
	}
	
	public Producto actualizar(Producto entity) {
		return repository.save(entity);
	}
	
	public Producto consultarPorId(Producto entity) {
		return repository.findById(entity.getId()).orElse(null);
	}
	
	public List<Producto>consultarTodos() {
		return repository.findAll();
	}
}
