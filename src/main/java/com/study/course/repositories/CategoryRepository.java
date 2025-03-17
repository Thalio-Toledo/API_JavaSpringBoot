package com.study.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.study.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
