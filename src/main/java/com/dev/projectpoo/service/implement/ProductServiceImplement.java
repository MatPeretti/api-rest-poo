package com.dev.projectpoo.service.implement;

import com.dev.projectpoo.entity.ProductEntity;
import com.dev.projectpoo.repository.ProductRepository;
import com.dev.projectpoo.service.ProductService;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImplement implements ProductService {

    private final ProductRepository productRepository;

    public ProductServiceImplement(ProductRepository productRepository) {

        this.productRepository = productRepository;
    }

    @Override
    public List<ProductEntity> findAllProducts() {

        return productRepository.findAll();
    }

    @Override
    public Optional<ProductEntity> findById(Long id) {

        return productRepository.findById(id);
    }

    @Override
    public ProductEntity saveProduct(ProductEntity productEntity) {

        return productRepository.save(productEntity);
    }

    @Override
    public ProductEntity updateProduct(ProductEntity productEntity) {

        return productRepository.save(productEntity);

    }

    @Override
    public void deleteProduct(Long id) {

        productRepository.deleteById(id);

    }
}


