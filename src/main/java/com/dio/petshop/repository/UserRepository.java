package com.dio.petshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dio.petshop.model.User;

//UserRepository.java
public interface UserRepository extends JpaRepository<User, Long> {
}
