package com.bomfim.sample.order.repository;

import com.bomfim.sample.order.domain.Order;
import org.springframework.stereotype.Repository;

import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;

@Repository
public class OrderRepository implements IOrderRepository {

    private Map<Long, Order> orders = new ConcurrentHashMap<>();

    @Override
    public Optional<Order> getOrderById(Long id) {
        return Optional.ofNullable(orders.get(id));
    }

    @Override
    public Order createOrder(Long productId, Long quantity) {
        long id = orders.size() + 1L;
        Order order = new Order(id, productId, quantity);
        orders.put(id, order);
        return order;
    }

}
