package com.hello.petshop.mapper;

import com.hello.petshop.entity.TestUser;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface  TestUserMapper {
    public TestUser loadUser(TestUser testUser);

    public TestUser loadUser();
}
