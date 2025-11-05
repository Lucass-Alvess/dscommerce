package com.lucasdev.dscommerce.repositories;

import com.lucasdev.dscommerce.entities.Order;
import com.lucasdev.dscommerce.entities.User;
import com.lucasdev.dscommerce.projection.UserDetailsProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface OrderRepository extends JpaRepository<Order, Long> {


}
