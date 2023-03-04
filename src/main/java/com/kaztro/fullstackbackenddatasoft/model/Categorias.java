package com.kaztro.fullstackbackenddatasoft.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Categorias {
    
    @Id
    @GeneratedValue
    private Integer cat_id;

    private String cat_nombre;

    private Integer cat_orden;

    private String cat_imagen;

    @OneToMany(cascade = CascadeType.ALL, targetEntity = Productos.class)
    @JoinColumn(name = "cat_id", referencedColumnName = "cat_id")
    private List<Productos> productos;
}
