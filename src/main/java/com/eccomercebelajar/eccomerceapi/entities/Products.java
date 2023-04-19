package com.eccomercebelajar.eccomerceapi.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

@Entity
@Data
public class Products implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    private String name;
    private String description;
    private String image;

    private BigDecimal price;
    private Double stock;

    @JoinColumn
    @ManyToOne
    private Categories categories;


}
