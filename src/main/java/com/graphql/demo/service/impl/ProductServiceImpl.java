package com.graphql.demo.service.impl;

import com.graphql.demo.exception.CategoryNotFoundException;
import com.graphql.demo.model.Category;
import com.graphql.demo.model.Product;
import com.graphql.demo.repository.CategoryRepository;
import com.graphql.demo.repository.ProductRepository;
import com.graphql.demo.service.ProductService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;
    private final CategoryRepository categoryRepository;

    public ProductServiceImpl(ProductRepository productRepository, CategoryRepository categoryRepository){
        this.productRepository = productRepository;
        this.categoryRepository = categoryRepository;
    }

    @Transactional
    @Override
    public Product addProduct(String name, String quantity, String type, String categoryId) {
        Category category = categoryRepository.findById(categoryId).orElseThrow(()-> new CategoryNotFoundException("Category not found"));
        Product product = new Product();
        product.setName(name);
        product.setQuantity(quantity);
        product.setType(type);
        product.setCategory(category);
       return productRepository.save(product);
    }

    @Transactional
    @Override
    public List<Product> findAll() {
        return (List<Product>) productRepository.findAll();
    }

    @Transactional
    @Override
    public Optional<Product> findById(String id) {
        return productRepository.findById(id);
    }
}
