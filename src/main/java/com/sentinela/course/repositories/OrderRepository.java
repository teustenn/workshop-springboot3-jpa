package com.sentinela.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sentinela.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
