package com.techacademy.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.techacademy.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {
}