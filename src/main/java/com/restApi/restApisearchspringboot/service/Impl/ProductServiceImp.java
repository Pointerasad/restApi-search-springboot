package com.restApi.restApisearchspringboot.service.Impl;

import com.restApi.restApisearchspringboot.entity.Product;
import com.restApi.restApisearchspringboot.repository.ProductRepository;
import com.restApi.restApisearchspringboot.service.ProductService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImp implements ProductService {

    private ProductRepository productRepository;

    public ProductServiceImp(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public List<Product> searchProduct(String query) {
        return productRepository.searchProducts(query);
    }

    @Override
    public Product createProduct(Product product) {
        return productRepository.save(product);
    }

}
