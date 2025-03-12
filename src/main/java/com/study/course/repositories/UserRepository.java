package com.study.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.study.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
