package com.kaztro.fullstackbackenddatasoft.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kaztro.fullstackbackenddatasoft.model.Product;

public interface ProductosRepository extends JpaRepository<Product, Integer> {
    
}
