package com.lucasdev.dscommerce.dto;

import com.lucasdev.dscommerce.entities.Category;

public class CategoryDTO {

    private Long id;
    private String name;

    public CategoryDTO(String name, Long id) {
        this.name = name;
        this.id = id;
    }

    public CategoryDTO(Category entity) {
       name = entity.getName();
       id = entity.getId();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
