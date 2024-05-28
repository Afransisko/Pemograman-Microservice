/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.andre.product.service;

import com.andre.product.repository.ProductRepository;
import com.andre.product.entity.Product;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 *
 * @author Frans
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

    public Product getProduct(Long id){
        return productRepository.findById(id).get();
    }
    
    
}
