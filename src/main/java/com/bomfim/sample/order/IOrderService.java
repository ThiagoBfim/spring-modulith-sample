
package com.bomfim.sample.order;

import com.bomfim.sample.order.domain.Order;

import java.util.Optional;

public interface IOrderService {
    Optional<Order> getOrder(Long id);

    Order createOrder(Long productId, Long quantity);
}
