package com.hello.petshop.service.impl;

import com.hello.petshop.entity.TestUser;
import com.hello.petshop.mapper.TestUserMapper;
import com.hello.petshop.service.TestIUserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestUserService implements TestIUserService {
    @Autowired
    private TestUserMapper testUserMapper;
    @Override
    public boolean loadUser(TestUser testUser) {
        TestUser u=testUserMapper.loadUser(testUser);
        return u!=null?true:false;
    }

    public boolean loadUser() {
        TestUser u=testUserMapper.loadUser();
        System.out.println(u);
        return u!=null?true:false;
    }
}
