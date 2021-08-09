package com.aop.springbootaop.service;

import com.aop.springbootaop.dto.UserDTO;
import com.aop.springbootaop.exception.UserNotFoundException;
import com.aop.springbootaop.map.UserMapper;
import com.aop.springbootaop.model.User;
import com.aop.springbootaop.repository.UserRepository;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UserServiceImpl implements UserService{

    final UserMapper userMapper;

      final UserRepository userRepository;

    @Override
    public User saveUser(UserDTO userDTO) {

        User user= userMapper.toUser(userDTO);
        return userRepository.save(user);

    }

    @Override
    public User updateUser(UserDTO userDTO,int id) {

        User newUser=userRepository.findById(id).orElseThrow(() -> new UserNotFoundException());
        newUser.setFirstName(userDTO.getFirstName());
        newUser.setLastName(userDTO.getLastName());
        newUser.setAge(userDTO.getAge());


        return userRepository.save(newUser);
    }

    @Override
    public void deleteUser(int id) {
        User user=userRepository.findById(id).orElseThrow(() -> new UserNotFoundException());
          userRepository.delete(user);
    }

    @Override
    public Optional<User> findById(int id) {
        return userRepository.findById(id);
    }

    @Override
    public List<User> getUsers() {
        return (List<User>) userRepository.findAll();
    }


}
