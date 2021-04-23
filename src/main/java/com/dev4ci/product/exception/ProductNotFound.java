/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dev4ci.product.exception;

/**
 *
 * @author rickenbazolo
 */
public class ProductNotFound extends RuntimeException {

    public ProductNotFound(String message) {
        super(message);
    }
    
}
