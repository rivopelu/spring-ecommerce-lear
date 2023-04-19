package com.eccomercebelajar.eccomerceapi.repositories;

import com.eccomercebelajar.eccomerceapi.entities.Products;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductsRepository extends JpaRepository<Products, String> {

}
