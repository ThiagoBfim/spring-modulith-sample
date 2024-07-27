package com.bomfim.sample.product.repository;

import com.bomfim.sample.product.domain.Product;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.Optional;

@Repository
public class ProductRepository implements IProductRepository {

    @Override
    public Optional<Product> getProductById(Long id) {
        return Optional.of(new Product(id, "Keyboard", BigDecimal.valueOf(20)));
    }
}
