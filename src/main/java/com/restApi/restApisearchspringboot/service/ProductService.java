package com.restApi.restApisearchspringboot.service;

import com.restApi.restApisearchspringboot.entity.Product;

import java.util.List;

public interface ProductService {

    List<Product> searchProduct(String query);

    Product createProduct(Product product);
}
