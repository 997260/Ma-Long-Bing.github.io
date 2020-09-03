package com.hellojava.mapper;

import com.hellojava.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    public User loadUser(User user);
}
