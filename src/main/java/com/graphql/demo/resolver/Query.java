package com.graphql.demo.resolver;

import com.graphql.demo.model.Category;
import com.graphql.demo.model.Product;
import com.graphql.demo.service.CategoryService;
import com.graphql.demo.service.ProductService;
import graphql.kickstart.tools.GraphQLQueryResolver;
import org.springframework.stereotype.Component;

@Component
public class Query implements GraphQLQueryResolver {

    private ProductService productService;
    private CategoryService categoryService;


    public Query(ProductService productService, CategoryService categoryService)
    {
        this.productService = productService;
        this.categoryService = categoryService;
    }

    public Iterable<Product> getAllProducts(){
        return productService.findAll();
    }

    public Iterable<Category> getAllCategories(){
        return categoryService.findAll();
    }
    public Product getProduct(String id){
        return productService.findById(id).orElseThrow(null);
    }

    public Category getCategory(String id){
        return categoryService.findById(id).orElseThrow(null);
    }

}
