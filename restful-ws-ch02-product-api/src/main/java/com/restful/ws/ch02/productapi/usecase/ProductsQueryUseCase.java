package com.restful.ws.ch02.productapi.usecase;

import com.restful.ws.ch02.productapi.domain.Product;

import java.util.List;

public interface ProductsQueryUseCase {
    Product getProductById(String productId);
    List<? extends Product> getAllProducts();
}
