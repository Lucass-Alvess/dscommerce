package com.lucasdev.dscommerce.dto;

import com.lucasdev.dscommerce.entities.Product;

public class ProductMinDTO {

    private Long id;
    private String name;
    private Double price;
    private String imgUrl;

    public ProductMinDTO() {
    }

    public ProductMinDTO(String imgUrl, Long id, String name, Double price) {
        this.imgUrl = imgUrl;
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public ProductMinDTO(Product entity) {
        id = entity.getId();
        name = entity.getName();
        price = entity.getPrice();
        imgUrl = entity.getImgUrl();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    public String getImgUrl() {
        return imgUrl;
    }
}
