package com.restful.ws.ch02.productapi.adapter.inbound.rest;

import com.restful.ws.ch02.productapi.adapter.inbound.rest.dto.ProductDescriptionInput;
import com.restful.ws.ch02.productapi.adapter.inbound.rest.dto.ProductInput;
import com.restful.ws.ch02.productapi.adapter.inbound.rest.dto.ProductOutput;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Spring handles this clase to handle request to our endpoints
 */
@RestController
@RequestMapping("/api/products")
public class ProductController implements ProductsApi {
    @Override
    public ResponseEntity<ProductOutput> createOrUpdateProduct(String productId, ProductInput productInput) {
        return null;
    }

    @Override
    public ResponseEntity<Void> deleteProduct(String productId) {
        return null;
    }

    @Override
    public ResponseEntity<ProductOutput> editProductDescription(String productId, ProductDescriptionInput input) {
        return null;
    }

    @Override
    public ResponseEntity<ProductOutput> getProductById(String productId) {
        return null;
    }

    @Override
    public ResponseEntity<List<ProductOutput>> getProducts() {
        return null;
    }
}
