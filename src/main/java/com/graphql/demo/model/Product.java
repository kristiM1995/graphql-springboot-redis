package com.graphql.demo.model;

import org.springframework.data.redis.core.RedisHash;

@RedisHash(value = "Product", timeToLive = 600L)
public class Product {
    private String id;
    private String name;
    private String quantity;
    private String type;
    private Category category;

    public Product() {
    }

    public Product(String id, String name, String quantity, String type, Category category) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.type = type;
        this.category = category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
