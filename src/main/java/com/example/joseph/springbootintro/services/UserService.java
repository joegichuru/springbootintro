package com.example.joseph.springbootintro.services;

import com.example.joseph.springbootintro.domain.User;

import java.util.List;

/**
 * Created by joseph on 9/3/17.
 * Email: developergitch@outlook.com
 */
public interface UserService {
    User addUser(User user);
    User removeUser(User user);
    List<User> findAll();
    User updateUser(User user);
}
