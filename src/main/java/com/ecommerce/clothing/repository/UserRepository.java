package com.ecommerce.clothing.repository;

import com.ecommerce.clothing.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}