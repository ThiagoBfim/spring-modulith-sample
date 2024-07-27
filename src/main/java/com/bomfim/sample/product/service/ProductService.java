package com.bomfim.sample.product.service;

import com.bomfim.sample.product.IProductService;
import com.bomfim.sample.product.domain.Product;
import com.bomfim.sample.product.repository.IProductRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProductService implements IProductService {

    private final IProductRepository productRepository;

    public ProductService(IProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public Optional<Product> getProductById(Long id) {
        return productRepository.getProductById(id);
    }

}
