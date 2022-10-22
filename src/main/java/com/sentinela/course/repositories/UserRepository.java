package com.sentinela.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sentinela.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
