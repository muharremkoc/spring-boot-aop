package com.aop.springbootaop.controller;

import com.aop.springbootaop.caching.CacheController;
import com.aop.springbootaop.dto.UserDTO;
import com.aop.springbootaop.map.UserMapper;
import com.aop.springbootaop.model.User;
import com.aop.springbootaop.service.UserService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/versions/aop")
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UserController {

    final UserMapper userMapper;

    final UserService userService;

    final CacheController cacheController;








   /*
    @PostMapping(value = "/user")
    public ResponseEntity<UserDTO> create(@RequestBody UserDTO userDTO){

        userService.saveUser(userMapper.toUser(userDTO));

        return ResponseEntity.status(HttpStatus.CREATED).body(userDTO);
    }

    */





    @PostMapping("/user")
    public User createUser(@RequestBody UserDTO userDTO) {

        return userService.saveUser(userDTO);

    }

    @PutMapping(value = "/user/{id}")
    public User updateUser(@PathVariable("id") int id, @RequestBody UserDTO userDTO) {
        return userService.updateUser(userDTO, id);

    }
    @DeleteMapping(value = "/user/{id}")
    public void deleteUser(@PathVariable("id") int id){
        userService.deleteUser(id);
    }
    @GetMapping("/user/{id}")
    public ResponseEntity<UserDTO> findById(@PathVariable int id){

        Optional<User> user = userService.findById(id);

        return ResponseEntity.ok(userMapper.toUserDTO(user.get()));
    }
    @GetMapping("/users")
    public ResponseEntity<List<User>> findAll() throws InterruptedException {

        cacheController.cacheControl();

        return ResponseEntity.ok(userMapper.toUsers(userService.getUsers()));
    }

}
