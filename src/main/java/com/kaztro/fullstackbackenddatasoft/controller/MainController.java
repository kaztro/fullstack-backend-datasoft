package com.kaztro.fullstackbackenddatasoft.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.kaztro.fullstackbackenddatasoft.repository.CategoriasRepository;
import com.kaztro.fullstackbackenddatasoft.repository.ProductosRepository;

import com.kaztro.fullstackbackenddatasoft.model.Categorias;
import com.kaztro.fullstackbackenddatasoft.model.Productos;

@RestController
public class MainController {

    @Autowired
    private CategoriasRepository categoriasRepository;

    @Autowired
    private ProductosRepository productosRepository;

    /* Metodos POST */

    /**
     * Función para almacenar una nueva categoria en la base de datos
     * @param newCategory
     * @return La data que es almacenada en la base
     */
    @PostMapping("/categoria")
    Categorias newCategory (@RequestBody Categorias newCategory) {
        return categoriasRepository.save(newCategory);
    }

    /**
     * Función para almacenar un nuevo producto en la base de datos
     * @param newProduct
     * @return La data que es almacenada en la base
     */
    @PostMapping("/producto")
    Productos newProduct (@RequestBody Productos newProduct) {
        return productosRepository.save(newProduct);
    }

    /**
     * Función que optiene todas las categorias
     * @return Un arreglo con todas categorias
     */
    @GetMapping("/categorias")
    List<Categorias> getAllCategories() {
        return categoriasRepository.findAll();
    }

/* 
    @GetMapping("/productos")
    ResponseEntity<List<Productos>> getProductByCategory(@RequestParam Integer cat_id) {
        return new ResponseEntity<List<Productos>>(categoriasRepository.findProductsById(cat_id), HttpStatus.OK);
    }
*/
}
