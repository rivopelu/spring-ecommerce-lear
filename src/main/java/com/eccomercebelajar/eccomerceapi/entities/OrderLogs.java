package com.eccomercebelajar.eccomerceapi.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Entity
@Data
public class OrderLogs implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @JoinColumn
    @ManyToOne
    private Orders orders;

    @JoinColumn
    @ManyToOne
    private Users users;

    private Integer logType;
    private String logMessage;
    @Temporal(TemporalType.TIMESTAMP)
    private Date date;


}
