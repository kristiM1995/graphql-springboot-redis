package com.graphql.demo.service.impl;

import com.graphql.demo.model.Category;
import com.graphql.demo.model.Product;
import com.graphql.demo.repository.CategoryRepository;
import com.graphql.demo.repository.ProductRepository;
import com.graphql.demo.service.CategoryService;
import com.graphql.demo.service.ProductService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryServiceImpl implements CategoryService {

    private final CategoryRepository categoryRepository;

    public CategoryServiceImpl(CategoryRepository categoryRepository){
        this.categoryRepository = categoryRepository;
    }

    @Transactional
    @Override
    public Category addCategory(String name) {
        Category category = new Category();
        category.setName(name);
       return categoryRepository.save(category);
    }

    @Transactional
    @Override
    public List<Category> findAll() {
        return (List<Category>) categoryRepository.findAll();
    }

    @Transactional
    @Override
    public Optional<Category> findById(String id) {
        return categoryRepository.findById(id);
    }
}
