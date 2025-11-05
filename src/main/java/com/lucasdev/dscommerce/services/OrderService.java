package com.lucasdev.dscommerce.services;

import com.lucasdev.dscommerce.dto.OrderDTO;
import com.lucasdev.dscommerce.dto.ProductDTO;
import com.lucasdev.dscommerce.entities.Order;
import com.lucasdev.dscommerce.entities.Product;
import com.lucasdev.dscommerce.repositories.OrderRepository;
import com.lucasdev.dscommerce.repositories.ProductRepository;
import com.lucasdev.dscommerce.services.exceptions.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class OrderService {

    @Autowired
    private OrderRepository repository;

    @Transactional(readOnly = true)
    public OrderDTO findById(Long id){
        Order order = repository.findById(id).orElseThrow(
                () -> new ResourceNotFoundException("Recurso não encontrado"));

        OrderDTO dto = new OrderDTO(order);
        return dto;
    }

}
