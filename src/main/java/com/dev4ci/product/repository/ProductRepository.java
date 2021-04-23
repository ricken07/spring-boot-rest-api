/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dev4ci.product.repository;

import com.dev4ci.product.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author rickenbazolo
 */
public interface ProductRepository extends JpaRepository<Product, Long>{
    
}
