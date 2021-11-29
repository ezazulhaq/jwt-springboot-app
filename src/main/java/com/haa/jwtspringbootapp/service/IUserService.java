package com.haa.jwtspringbootapp.service;

import java.util.Optional;

import com.haa.jwtspringbootapp.entity.User;

public interface IUserService {

    Integer saveUser(User user);

    Optional<User> findByUsername(String username);
}
