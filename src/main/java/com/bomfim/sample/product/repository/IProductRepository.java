package com.bomfim.sample.product.repository;

import com.bomfim.sample.product.domain.Product;

import java.util.Optional;

public interface IProductRepository {
    Optional<Product> getProductById(Long id);
}
