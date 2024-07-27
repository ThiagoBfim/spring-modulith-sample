package com.bomfim.sample.order.service;

import com.bomfim.sample.order.IOrderService;
import com.bomfim.sample.order.domain.Order;
import com.bomfim.sample.order.repository.IOrderRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class OrderService implements IOrderService {

    private final IOrderRepository orderRepository;

    public OrderService(IOrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @Override
    public Optional<Order> getOrder(Long id) {
        return orderRepository.getOrderById(id);
    }

    @Override
    public Order createOrder(Long productId, Long quantity) {
        return orderRepository.createOrder(productId, quantity);
    }
}
