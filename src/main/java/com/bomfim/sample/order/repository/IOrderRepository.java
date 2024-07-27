package com.bomfim.sample.order.repository;

import com.bomfim.sample.order.domain.Order;

import java.util.Optional;

public interface IOrderRepository {
    Optional<Order> getOrderById(Long id);

    Order createOrder(Long productId, Long quantity);

}
