package com.tutorial.hateoas.repository;

import com.tutorial.hateoas.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
