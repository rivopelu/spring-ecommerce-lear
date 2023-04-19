package com.eccomercebelajar.eccomerceapi.entities;

import com.eccomercebelajar.eccomerceapi.enums.OrderStatus;
import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Data
public class Orders implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    private String orderNumber;
    @Temporal(TemporalType.DATE)
    private Date date;

    @JoinColumn
    @ManyToOne
    private Users users;
    private String shippingAddress;

    private BigDecimal amount;
    private BigDecimal total;

    @Enumerated(EnumType.STRING)
    private OrderStatus orderStatus;

    @Temporal(TemporalType.TIMESTAMP)
    private Date orderCreated;


}
