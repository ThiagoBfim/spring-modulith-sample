package com.bomfim.sample.product.domain;

import java.math.BigDecimal;

public record Product(Long id, String name, BigDecimal price) {

}
