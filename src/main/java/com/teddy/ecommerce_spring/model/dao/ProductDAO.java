package com.teddy.ecommerce_spring.model.dao;

import com.teddy.ecommerce_spring.model.Product;
import org.springframework.data.repository.ListCrudRepository;


/**
 * Data Access Object for accessing Product data.
 */
public interface ProductDAO extends ListCrudRepository<Product, Long> {}