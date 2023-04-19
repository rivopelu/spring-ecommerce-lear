package com.eccomercebelajar.eccomerceapi.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

@Entity
@Data
public class OrderItems implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @JoinColumn
    @ManyToOne
    private Orders orders;

    @JoinColumn
    @ManyToOne
    private Products products;
    private String description;
    private Double quantity;
    private BigDecimal pricePerItems;
    private BigDecimal amount;
}
