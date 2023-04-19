package com.eccomercebelajar.eccomerceapi.controllers.impl;

import com.eccomercebelajar.eccomerceapi.controllers.CategoriesController;
import com.eccomercebelajar.eccomerceapi.dto.CreateCategoryDto;
import com.eccomercebelajar.eccomerceapi.helper.ResponseHelper;
import com.eccomercebelajar.eccomerceapi.model.response.BaseResponse;
import com.eccomercebelajar.eccomerceapi.services.CategoriesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class CategoriesControllerImpl implements CategoriesController {

    @Autowired
    private CategoriesService categoriesService;

    @Override
    public ResponseEntity<BaseResponse> getListCategories() {
        return ResponseHelper.buildOkResponse(categoriesService.findAll());
    }

    @Override
    public ResponseEntity<BaseResponse> getDetailCategories(String id) throws Exception {
        return ResponseHelper.buildOkResponse(categoriesService.findById(id));
    }

    @Override
    public ResponseEntity<BaseResponse> editCategories(String id, CreateCategoryDto data) throws Exception {
        String dataRes = categoriesService.Edit(id, data);
        return ResponseHelper.buildOkResponse(dataRes);
    }

    @Override
    public ResponseEntity<BaseResponse> CreatedCategories(CreateCategoryDto data) {
        return ResponseHelper.buildOkResponse(categoriesService.create(data));
    }
}
