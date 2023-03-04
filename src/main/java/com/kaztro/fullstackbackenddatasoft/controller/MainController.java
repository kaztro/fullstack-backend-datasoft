package com.kaztro.fullstackbackenddatasoft.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.kaztro.fullstackbackenddatasoft.repository.CategoriasRepository;
import com.kaztro.fullstackbackenddatasoft.repository.ProductosRepository;

import com.kaztro.fullstackbackenddatasoft.model.Category;
import com.kaztro.fullstackbackenddatasoft.model.PostRequest;
import com.kaztro.fullstackbackenddatasoft.model.Product;

@RestController
public class MainController {

    @Autowired
    private CategoriasRepository categoriasRepository;

    @Autowired
    private ProductosRepository productosRepository;

    /* Metodos POST */

    /**
     * Función para almacenar una nueva categoria 
     * con uno o varios productos a la vez en la base de datos
     * @param newCategory
     * @return La data que es almacenada en la base
     */
    @PostMapping("/categoria")
    Category newCategory(@RequestBody PostRequest request) {
        return categoriasRepository.save(request.getCategory());
    }

    /**
     * Función para almacenar un nuevo producto a la vez en la base de datos
     * @param newProduct
     * @return La data que es almacenada en la base
     */
    @PostMapping("/producto")
    Product newProduct (@RequestBody Product newProduct) {
        return productosRepository.save(newProduct);
    }

    /**
     * Función que optiene todas las categorias junto con los productos
     * @return Un arreglo con todas categorias
     */
    @GetMapping("/categorias")
    List<Category> getAllCategories() {
        return categoriasRepository.findAll();
    }
}
