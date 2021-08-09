package com.aop.springbootaop.service;

import com.aop.springbootaop.dto.UserDTO;
import com.aop.springbootaop.model.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    User saveUser(UserDTO userDTO);
    User updateUser(UserDTO userDTO,int id);
    void deleteUser(int id);
    Optional<User> findById(int id);
    List<User> getUsers();
}
