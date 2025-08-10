package com.example.springdatajpademo.repository;

import com.example.springdatajpademo.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
