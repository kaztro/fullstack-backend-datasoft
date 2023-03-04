package com.kaztro.fullstackbackenddatasoft.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kaztro.fullstackbackenddatasoft.model.Categorias;

public interface CategoriasRepository extends JpaRepository<Categorias, Integer> {
    //List<Productos> findProductsById(Integer cat_id);
}
