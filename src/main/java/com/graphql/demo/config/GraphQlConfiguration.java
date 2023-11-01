package com.graphql.demo.config;

import com.graphql.demo.resolver.Mutation;
import com.graphql.demo.resolver.ProductResolver;
import com.graphql.demo.resolver.Query;
import com.graphql.demo.service.CategoryService;
import com.graphql.demo.service.ProductService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GraphQlConfiguration {

    @Bean
    public ProductResolver categoryResolver(CategoryService categoryService) {
        return new ProductResolver(categoryService);
    }
//
//    @Bean
//    public Query query(ProductService productService, CategoryService categoryService) {
//        return new Query(productService, categoryService);
//    }
//
//    @Bean
//    public Mutation mutation(CategoryService categoryService, ProductService productService) {
//        return new Mutation(productService, categoryService);
//    }

}
