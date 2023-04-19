package com.eccomercebelajar.eccomerceapi.repositories;

import com.eccomercebelajar.eccomerceapi.entities.Cart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartRepository extends JpaRepository<Cart, String> {
}
