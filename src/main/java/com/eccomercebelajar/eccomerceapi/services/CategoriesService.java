package com.eccomercebelajar.eccomerceapi.services;

import com.eccomercebelajar.eccomerceapi.dto.CreateCategoryDto;
import com.eccomercebelajar.eccomerceapi.entities.Categories;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CategoriesService {

    Categories findById(String id);

    List<Categories> findAll();

    String create(CreateCategoryDto createCategoryDto);


    String Edit(String id, CreateCategoryDto data);

    public String deleteById(String id);


}
