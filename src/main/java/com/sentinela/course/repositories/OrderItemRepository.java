package com.sentinela.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sentinela.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
