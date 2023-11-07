package com.sha.crud.service;

import com.sha.crud.entity.User;

import java.util.List;

public interface UserService {
    User saveUser(User user);
    List<User> saveUsers(List<User> users);

    List<User> getUsers();
    User getUserById(long id);
    User getUserByUsername(String username);

    String deleteUser(long id);

    User updateUser(User user);



}
