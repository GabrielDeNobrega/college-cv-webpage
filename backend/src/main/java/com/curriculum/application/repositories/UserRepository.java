package com.curriculum.application.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.curriculum.application.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
