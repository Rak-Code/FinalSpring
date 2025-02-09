package com.ecommerce.clothing.repository;

import com.ecommerce.clothing.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}