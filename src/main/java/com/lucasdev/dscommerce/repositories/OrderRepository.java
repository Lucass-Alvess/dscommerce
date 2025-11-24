package com.lucasdev.dscommerce.repositories;

import com.lucasdev.dscommerce.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {


}
