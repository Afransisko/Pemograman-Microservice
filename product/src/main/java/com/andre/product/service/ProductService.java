/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.andre.product.service;

import com.andre.product.Repository.ProductRepository;
import com.andre.product.entity.Product;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @dell
 */
@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;
    
    public List<Product> getAll(){
        return productRepository.findAll();
    }
    
    public void insert(Product product){
        productRepository.save(product);
    }

    public Product getById(Long id) {
        Optional<Product> productOptional = productRepository.findById(id);
        return productOptional.orElse(null);
    }

    public void update(Long id, Product product) {
        product.setId(id); // Set ID of the product to be updated
        productRepository.save(product);
    }

    public void delete(Long id) {
        productRepository.deleteById(id);
    }
}