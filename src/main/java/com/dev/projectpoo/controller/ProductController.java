package com.dev.projectpoo.controller;

import com.dev.projectpoo.entity.ProductEntity;
import com.dev.projectpoo.service.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/product")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {

        this.productService = productService;
    }

    @GetMapping
    public List<ProductEntity> findAllProducts(){

        return productService.findAllProducts();
    }

    @GetMapping("/{id}")
    public Optional<ProductEntity> findProductById(@PathVariable("id") Long id) {

        return productService.findById(id);
    }

    @PostMapping
    public ProductEntity saveProduct(@RequestBody ProductEntity productEntity) {
        return productService.saveProduct(productEntity);
    }

    @PutMapping
    public ProductEntity updateProduct(@RequestBody ProductEntity productEntity){
        return productService.updateProduct(productEntity);
    }

    @DeleteMapping("/{id}")
    public void deleteProduct(@PathVariable("id") Long id){
        productService.deleteProduct(id);
    }
}
