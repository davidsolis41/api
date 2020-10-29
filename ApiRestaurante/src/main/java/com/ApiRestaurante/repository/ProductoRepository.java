package com.ApiRestaurante.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.ApiRestaurante.entity.Producto;

@Repository
public interface ProductoRepository extends MongoRepository<Producto, String> {
	
}
