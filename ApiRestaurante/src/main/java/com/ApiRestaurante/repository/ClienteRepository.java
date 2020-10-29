package com.ApiRestaurante.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import com.ApiRestaurante.entity.Cliente;


@Repository
public interface ClienteRepository extends MongoRepository<Cliente, String> {
	
}
