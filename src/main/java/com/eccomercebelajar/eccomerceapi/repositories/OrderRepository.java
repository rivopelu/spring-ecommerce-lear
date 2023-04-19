package com.eccomercebelajar.eccomerceapi.repositories;

import com.eccomercebelajar.eccomerceapi.entities.Orders;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Orders, String> {

}
