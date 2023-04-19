package com.eccomercebelajar.eccomerceapi.services.impl;

import com.eccomercebelajar.eccomerceapi.dto.CreateCategoryDto;
import com.eccomercebelajar.eccomerceapi.entities.Categories;
import com.eccomercebelajar.eccomerceapi.exception.NotFoundException;
import com.eccomercebelajar.eccomerceapi.repositories.CategoriesRepository;
import com.eccomercebelajar.eccomerceapi.services.CategoriesService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class CategoriesServiceImpl implements CategoriesService {

    @Autowired
    private CategoriesRepository categoriesRepository;

    @Override
    public Categories findById(String id) {
        return categoriesRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("Category Not Found"));
    }

    @Override
    public List<Categories> findAll() {
        return categoriesRepository.findAll();
    }

    @Override
    public String create(CreateCategoryDto createCategoryDto) {
        Categories categories = Categories.builder().name(createCategoryDto.getName()).build();
        try {
            categoriesRepository.save(categories);
            return "Success Created";
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return "Error";

        }
    }

    @Override
    public String Edit(String id, CreateCategoryDto data) {
        Optional<Categories> categories = categoriesRepository.findById(id);
        if (categories.isEmpty()) {
            throw new NotFoundException("Category not found");
        }
        Categories categoriesSave = Categories.builder().name(data.getName()).id(id).build();
        categoriesRepository.save(categoriesSave);
        return "SUCCESS EDIT";
    }

    @Override
    public String deleteById(String id) {
        categoriesRepository.deleteById(id);
        return "Success Delete";
    }
}
