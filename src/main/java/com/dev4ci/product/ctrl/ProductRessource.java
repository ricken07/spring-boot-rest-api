/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dev4ci.product.ctrl;

import com.dev4ci.product.model.Product;
import com.dev4ci.product.service.ProductService;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author rickenbazolo
 */
@RestController
@RequestMapping("/product")
@AllArgsConstructor
public class ProductRessource {
    private final ProductService productService;
    
    @PostMapping("/add")
    public ResponseEntity<Product> add(@RequestBody Product product) {
        final Product p = productService.add(product);
        return ResponseEntity.ok(p);
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<Product> getProduct(@PathVariable Long id) {
        final Product p = productService.getProduct(id);
        return ResponseEntity.ok(p);
    }
    
    @GetMapping("/")
    public ResponseEntity<List<Product>> getProducts() {
        final List<Product> p = productService.getProducts();
        return ResponseEntity.ok(p);
    }
    
    @PutMapping("/update")
    public ResponseEntity<Product> update(@RequestBody Product product) {
        final Product p = productService.update(product);
        return ResponseEntity.ok(p);
    }
    
    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable Long id) {
        productService.delete(id);
        return ResponseEntity.ok("Produit supprimé");
    }
}
