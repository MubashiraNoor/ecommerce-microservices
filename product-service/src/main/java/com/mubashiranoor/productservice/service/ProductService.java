package com.mubashiranoor.productservice.service;

import com.mubashiranoor.productservice.dto.ProductRequest;
import com.mubashiranoor.productservice.dto.ProductResponse;
import com.mubashiranoor.productservice.model.Product;
import com.mubashiranoor.productservice.repository.ProductRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@RequiredArgsConstructor
@Service
public class ProductService {


    private final ProductRepo productRepo;
    public void createProduct(ProductRequest productRequest) {
        Product createProduct = Product.builder().name(productRequest.getName()).description(productRequest.getDescription()).price(productRequest.getPrice()).build();
        productRepo.save(createProduct);
    }

    public List<ProductResponse> getProducts() {
      List<Product> productList = productRepo.findAll();
     return productList.stream().map(a->mapToDto(a)).toList();
    }

    private ProductResponse mapToDto(Product product) {
      return  ProductResponse.builder().id(product.getId()).name(product.getName()).price(product.getPrice()).description(product.getDescription()).build();

    }
}
