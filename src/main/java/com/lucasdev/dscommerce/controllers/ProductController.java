package com.lucasdev.dscommerce.controllers;


import com.lucasdev.dscommerce.dto.ProductDTO;
import com.lucasdev.dscommerce.entities.Product;
import com.lucasdev.dscommerce.repositories.ProductRepository;
import com.lucasdev.dscommerce.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping(value = "/products")
public class ProductController {

    @Autowired
    private ProductService service;

    @GetMapping(value = "/{id}")
    public ProductDTO findById(@PathVariable Long id) {
        ProductDTO dto = service.findById(id);
        return dto;

    }

}
