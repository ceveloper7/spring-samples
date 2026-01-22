package com.restful.ws.ch02.productapi.adapter.inbound.rest;

import com.restful.ws.ch02.productapi.adapter.inbound.rest.dto.ProductDescriptionInput;
import com.restful.ws.ch02.productapi.adapter.inbound.rest.dto.ProductInput;
import com.restful.ws.ch02.productapi.adapter.inbound.rest.dto.ProductOutput;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;

import java.util.List;

/**
 * Define all Endpoints
 */
public interface ProductsApi {
    ResponseEntity<ProductOutput> createOrUpdateProduct(String productId, @Valid ProductInput productInput);
    ResponseEntity<Void> deleteProduct(String productId);
    ResponseEntity<ProductOutput> editProductDescription(String productId, @Valid ProductDescriptionInput input);
    ResponseEntity<ProductOutput> getProductById(String productId);
    ResponseEntity<List<ProductOutput>> getProducts();
}
