package com.bomfim.sample.product;

import com.bomfim.sample.product.domain.Product;

import java.util.Optional;

public interface IProductService {
    Optional<Product> getProductById(Long id);
}
