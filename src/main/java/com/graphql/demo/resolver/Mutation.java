package com.graphql.demo.resolver;

import com.graphql.demo.model.Category;
import com.graphql.demo.model.Product;
import com.graphql.demo.service.CategoryService;
import com.graphql.demo.service.ProductService;
import graphql.kickstart.tools.GraphQLMutationResolver;
import org.springframework.stereotype.Component;

@Component
public class Mutation implements GraphQLMutationResolver {

    private ProductService productService;
    private CategoryService categoryService;

    public Mutation(ProductService productService, CategoryService categoryService){
        this.categoryService = categoryService;
        this.productService = productService;
    }

    public Product newProduct(String name, String quantity, String type, String categoryId){
       return productService.addProduct(name, quantity, type, categoryId);
    }

    public Category newCategory(String name){
        return categoryService.addCategory(name);
    }
}
