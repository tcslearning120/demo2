package com.example.demo;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entity.User;

public interface UserRepositery extends CrudRepository<User, Integer> {

}
