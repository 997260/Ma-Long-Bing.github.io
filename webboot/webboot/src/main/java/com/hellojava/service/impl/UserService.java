package com.hellojava.service.impl;

import com.hellojava.entity.User;
import com.hellojava.mapper.UserMapper;
import com.hellojava.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService implements IUserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public boolean loadUser(User user) {
        User u=userMapper.loadUser(user);
        return u!=null?true:false;
    }
}
