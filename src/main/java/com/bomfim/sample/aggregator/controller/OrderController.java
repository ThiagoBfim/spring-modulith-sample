package com.bomfim.sample.aggregator.controller;

import com.bomfim.sample.aggregator.dto.OrderDto;
import com.bomfim.sample.aggregator.service.OrderAggregateService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/orders")
public class OrderController {

    private final OrderAggregateService orderAggregateService;

    public OrderController(OrderAggregateService orderAggregateService) {
        this.orderAggregateService = orderAggregateService;
    }

    @PostMapping
    public ResponseEntity<OrderDto> createOrder(Long productId, Long quantity) {
        OrderDto order = orderAggregateService.createOrder(productId, quantity);
        return ResponseEntity.status(HttpStatus.CREATED).body(order);
    }

    @GetMapping
    public ResponseEntity<OrderDto> getOrder(Long id) {
        var order = orderAggregateService.getOrder(id);
        return ResponseEntity.ok(order);
    }
}
