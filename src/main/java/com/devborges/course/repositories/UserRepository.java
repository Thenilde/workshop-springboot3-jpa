package com.devborges.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devborges.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
