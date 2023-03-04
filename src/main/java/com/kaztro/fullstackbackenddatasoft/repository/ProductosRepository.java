package com.kaztro.fullstackbackenddatasoft.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kaztro.fullstackbackenddatasoft.model.Productos;

public interface ProductosRepository extends JpaRepository<Productos, Integer> {
    
}
