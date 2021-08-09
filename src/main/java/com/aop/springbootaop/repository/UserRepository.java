package com.aop.springbootaop.repository;

import com.aop.springbootaop.dto.UserDTO;
import com.aop.springbootaop.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface UserRepository extends JpaRepository<User,Integer>{
}
