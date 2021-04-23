package com.dev4ci.product.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

/**
 *
 * @author rickenbazolo
 */
@Entity
@Table(name = "tbl_product")
@Data
public class Product implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false, unique = true)
    private Long id;
    private String name;
    private String description;
    private String imageUrl;
    private int price;
}
