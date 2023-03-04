package com.kaztro.fullstackbackenddatasoft.model;

import java.math.BigDecimal;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "productos")
public class Product {
    
    @Id
    @GeneratedValue
    private Integer prd_id;

    private String prd_nombre;

    private String  prd_descripcion;

    private BigDecimal prd_precio;

    private Integer cat_id;

    private String prd_imagen;
    
}
