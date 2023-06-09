package com.eccomercebelajar.eccomerceapi.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

import java.io.Serializable;

@Entity
@Data
public class Users implements Serializable {

    @Id
    private String id;

    private String password;
    private String name;
    private String address;
    private String email;
    private String phone;
    private String roles;
    private Boolean isActive;
}
