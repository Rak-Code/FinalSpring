package com.ecommerce.clothing.service;

import com.ecommerce.clothing.entity.Order;
import java.util.List;

public interface OrderService {
    Order createOrder(Order order);
    Order getOrderById(Long id);
    List<Order> getAllOrders();
    Order updateOrderStatus(Long id, Order.OrderStatus status);
}