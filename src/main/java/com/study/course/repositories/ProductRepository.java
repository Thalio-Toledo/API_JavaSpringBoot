package com.study.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.study.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
