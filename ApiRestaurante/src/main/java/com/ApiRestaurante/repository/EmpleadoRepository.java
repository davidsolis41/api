package com.ApiRestaurante.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.ApiRestaurante.entity.Empleado;

@Repository
public interface EmpleadoRepository extends MongoRepository<Empleado, String>{

}
