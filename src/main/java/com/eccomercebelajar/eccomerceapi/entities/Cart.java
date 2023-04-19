package com.eccomercebelajar.eccomerceapi.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

@Entity
@Data
public class Cart implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @JoinColumn
    @ManyToOne
    private Products products;
    @JoinColumn
    @ManyToOne
    private Users users;
    private Double quantity;
    private BigDecimal price;
    private BigDecimal amount;


}
