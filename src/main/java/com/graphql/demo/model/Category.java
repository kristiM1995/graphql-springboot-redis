package com.graphql.demo.model;

import lombok.RequiredArgsConstructor;
import org.springframework.data.redis.core.RedisHash;

@RedisHash(value = "Category", timeToLive = 600L)
public class Category {
    private String id;
    private String name;

    public Category() {
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
}
