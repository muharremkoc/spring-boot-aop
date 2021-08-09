package com.aop.springbootaop.map;

import com.aop.springbootaop.dto.UserDTO;
import com.aop.springbootaop.model.User;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
    UserDTO toUserDTO(User user);
    User toUser(UserDTO userDTO);
    List<User> toUsers(List<User>users);
}
