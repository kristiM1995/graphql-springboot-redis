package com.graphql.demo.service;

import com.graphql.demo.model.Category;
import com.graphql.demo.model.Product;

import java.util.List;
import java.util.Optional;

public interface CategoryService {
    Category addCategory(String name);
    List<Category> findAll();
    Optional<Category> findById(String id);
}
