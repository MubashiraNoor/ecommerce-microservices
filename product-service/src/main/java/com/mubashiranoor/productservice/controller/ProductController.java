package com.mubashiranoor.productservice.controller;


import com.mubashiranoor.productservice.dto.ProductRequest;
import com.mubashiranoor.productservice.dto.ProductResponse;
import com.mubashiranoor.productservice.model.Product;
import com.mubashiranoor.productservice.service.ProductService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/product")
@Slf4j
public class ProductController {


    private final ProductService productService;

    //create product

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public void createProduct(@RequestBody ProductRequest productRequest) {
        productService.createProduct(productRequest);
        log.info("Product saved successfully!");
    }


    @RequestMapping
    public List<ProductResponse> getProducts(){
       return productService.getProducts();
    }
}
