package com.sha.crud.service;

import com.sha.crud.entity.User;
import com.sha.crud.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    @Override
    public User saveUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public List<User> saveUsers(List<User> users) {
        return userRepository.saveAll(users);
    }

    @Override
    public List<User> getUsers() {
        return userRepository.findAll();
    }

    @Override
    public User getUserById(long id) {
        return userRepository.findById(id).orElse(null);
    }

    @Override
    public User getUserByUsername(String username) {
        return userRepository.findByUsername(username);
    }

    @Override
    public String  deleteUser(long id) {
        userRepository.deleteById(id);
        return "User deleted successful";
    }

    @Override
    public User updateUser(User user) {
        User updatingUser = userRepository.findById(user.getId()).orElse(null);
        updatingUser.setUsername(user.getUsername());
        return userRepository.save(updatingUser);
    }
}
