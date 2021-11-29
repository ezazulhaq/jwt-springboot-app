package com.haa.jwtspringbootapp.repo;

import java.util.Optional;

import com.haa.jwtspringbootapp.entity.User;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {

    Optional<User> findByUsername(String username);
}
