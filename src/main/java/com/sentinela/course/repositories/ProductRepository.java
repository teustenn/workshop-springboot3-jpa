package com.sentinela.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sentinela.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
