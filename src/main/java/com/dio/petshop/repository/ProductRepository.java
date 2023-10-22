package com.dio.petshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dio.petshop.model.Product;

//ProductRepository.java
public interface ProductRepository extends JpaRepository<Product, Long> {
}
