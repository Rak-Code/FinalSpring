package com.ecommerce.clothing.repository;

import com.ecommerce.clothing.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}