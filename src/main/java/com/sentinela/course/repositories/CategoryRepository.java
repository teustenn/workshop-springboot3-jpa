package com.sentinela.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sentinela.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
