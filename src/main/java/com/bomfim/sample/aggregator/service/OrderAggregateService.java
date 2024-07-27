package com.bomfim.sample.aggregator.service;

import com.bomfim.sample.aggregator.dto.OrderDto;
import com.bomfim.sample.order.IOrderService;
import com.bomfim.sample.order.domain.Order;
import com.bomfim.sample.product.IProductService;
import com.bomfim.sample.product.domain.Product;
import org.springframework.stereotype.Service;

@Service
public class OrderAggregateService {
    private final IProductService productService;
    private final IOrderService orderService;

    public OrderAggregateService(IProductService productService, IOrderService orderService) {
        this.productService = productService;
        this.orderService = orderService;
    }

    public OrderDto createOrder(Long productId, Long quantity) {
        Product product = productService.getProductById(productId).orElseThrow();
        Order order = orderService.createOrder(product.id(), quantity);
        return new OrderDto(order.id(), order.quantity(), order.productId());
    }

    public OrderDto getOrder(Long id) {
        Order order = orderService.getOrder(id).orElseThrow();
        return new OrderDto(order.id(), order.quantity(), order.productId());
    }
}
