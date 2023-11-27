package com.mubashiranoor.orderservice.repository;

import com.mubashiranoor.orderservice.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepo extends JpaRepository<Order,Long> {
}
