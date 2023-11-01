package com.graphql.demo.resolver;

import com.graphql.demo.exception.ProductNotFoundException;
import com.graphql.demo.model.Category;
import com.graphql.demo.model.Product;
import com.graphql.demo.service.CategoryService;
import graphql.kickstart.tools.GraphQLResolver;
import org.springframework.stereotype.Component;

@Component
public class ProductResolver implements GraphQLResolver<Product> {

    private final CategoryService categoryService;

    public ProductResolver(CategoryService categoryService){
        this.categoryService = categoryService;
    }

    public Category getCategory(String id){
        return categoryService.findById(id).orElseThrow(()->new ProductNotFoundException("Product with id " + id + " not found"));
    }
}
