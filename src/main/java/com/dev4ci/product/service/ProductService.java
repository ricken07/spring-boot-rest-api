/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dev4ci.product.service;

import com.dev4ci.product.exception.ProductNotFound;
import com.dev4ci.product.model.Product;
import com.dev4ci.product.repository.ProductRepository;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

/**
 *
 * @author rickenbazolo
 */
@Service
@AllArgsConstructor
public class ProductService {
    private final ProductRepository productRepository;

    public Product add(Product product) {
        return productRepository.save(product);
    }

    public Product getProduct(Long id) {
        return productRepository.findById(id).orElseThrow(() -> new ProductNotFound("Aucun produit trouvé"));
    }

    public List<Product> getProducts() {
        return productRepository.findAll();
    }

    public void delete(Long id) {
        productRepository.deleteById(id);
    }

    public Product update(Product product) {
        return productRepository.save(product);
    }
}
