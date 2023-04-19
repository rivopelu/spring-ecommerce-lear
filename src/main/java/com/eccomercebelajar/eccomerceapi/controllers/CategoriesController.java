package com.eccomercebelajar.eccomerceapi.controllers;

import com.eccomercebelajar.eccomerceapi.dto.CreateCategoryDto;
import com.eccomercebelajar.eccomerceapi.model.response.BaseResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/category")
public interface CategoriesController {


    @GetMapping("/list")
    ResponseEntity<BaseResponse> getListCategories() throws Exception;

    @GetMapping("detail/{id}")
    ResponseEntity<BaseResponse> getDetailCategories(@PathVariable("id") String id) throws Exception;

    @PutMapping("edit/{id}")
    ResponseEntity<BaseResponse> editCategories(@PathVariable("id") String id, @RequestBody CreateCategoryDto data) throws Exception;

    @PostMapping("/new")
    ResponseEntity<BaseResponse> CreatedCategories(@RequestBody CreateCategoryDto data) throws Exception;


}
