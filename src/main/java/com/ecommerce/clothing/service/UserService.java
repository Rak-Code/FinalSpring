package com.ecommerce.clothing.service;

import com.ecommerce.clothing.entity.User;
import java.util.List;

public interface UserService {
    User createUser(User user);
    User getUserById(Long id);
    List<User> getAllUsers();
}