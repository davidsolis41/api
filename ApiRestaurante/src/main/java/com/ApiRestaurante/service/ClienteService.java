package com.ApiRestaurante.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ApiRestaurante.entity.Cliente;
import com.ApiRestaurante.repository.ClienteRepository;

@Service
public class ClienteService {
	@Autowired
	ClienteRepository repository;
	
	public Cliente guardar(Cliente entity) {
		return repository.save(entity);
	}
	
	public boolean borrar(Cliente entity) {
		try {
			repository.delete(entity);
			return true;
		} catch(Exception ex) {
			return false;
		}
	}
	
	public boolean borrarPorId(Cliente entity) {
		try {
			repository.deleteById(entity.getId());
			return true;
		} catch(Exception ex) {
			return false;
		}
	}
	
	public Cliente actualizar(Cliente entity) {
		return repository.save(entity);
	}
	
	public Cliente consultarPorId(Cliente entity) {
		return repository.findById(entity.getId()).orElse(null);
	}
	
	public List<Cliente>consultarTodos() {
		return repository.findAll();
	}
}
