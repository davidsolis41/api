package com.ApiRestaurante.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.ApiRestaurante.entity.Cupon;

@Repository
public interface CuponRepository extends MongoRepository<Cupon, String>{

}
