package com.ApiRestaurante.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import com.ApiRestaurante.entity.Venta;

@Repository
public interface VentaRepository extends MongoRepository<Venta, String>{

}
