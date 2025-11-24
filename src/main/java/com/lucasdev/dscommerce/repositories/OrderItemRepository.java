package com.lucasdev.dscommerce.repositories;

import com.lucasdev.dscommerce.entities.Order;
import com.lucasdev.dscommerce.entities.OrderItem;
import com.lucasdev.dscommerce.entities.OrderItemPK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {


}
