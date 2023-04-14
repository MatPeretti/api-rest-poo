package com.dev.projectpoo.service;

import com.dev.projectpoo.entity.ProductEntity;

import java.util.List;
import java.util.Optional;

public interface ProductService {
    List<ProductEntity> findAllProducts();
    Optional<ProductEntity> findById(Long id);
    ProductEntity saveProduct(ProductEntity productEntity);
    ProductEntity updateProduct(ProductEntity productEntity);
    void deleteProduct(Long id);
}
