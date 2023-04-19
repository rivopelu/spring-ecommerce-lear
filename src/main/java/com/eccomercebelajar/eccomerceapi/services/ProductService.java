package com.eccomercebelajar.eccomerceapi.services;

import com.eccomercebelajar.eccomerceapi.entities.Products;
import com.eccomercebelajar.eccomerceapi.exception.NotFoundException;
import com.eccomercebelajar.eccomerceapi.repositories.ProductsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductsRepository productsRepository;

    public List<Products> getListProduct() {
        return productsRepository.findAll();
    }

    public Products findById(String id) {
        return productsRepository.findById(id).orElseThrow(() -> new NotFoundException("Product not found"));
    }

    public String create(Products products) {
        productsRepository.save(products);
        return "SUCCESS CREATED";
    }

    public String Edit(Products products) {
        productsRepository.save(products);
        return "SUCCESS Edit";
    }

    public String updateImage(String id, String urlImage) {
        Products products = findById(id);
        products.setId(urlImage);
        productsRepository.save(products);
        return "Success Update image";
    }

    public String Delete(String id) {
        productsRepository.deleteById(id);
        return "SUCCESS DELETED";

    }

}
