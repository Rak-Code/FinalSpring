package com.ecommerce.clothing.repository;

import com.ecommerce.clothing.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}