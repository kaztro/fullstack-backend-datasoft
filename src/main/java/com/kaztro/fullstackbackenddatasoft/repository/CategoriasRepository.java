package com.kaztro.fullstackbackenddatasoft.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kaztro.fullstackbackenddatasoft.model.Category;

public interface CategoriasRepository extends JpaRepository<Category, Integer> {
    //List<Productos> findProductsById(Integer cat_id);
}
