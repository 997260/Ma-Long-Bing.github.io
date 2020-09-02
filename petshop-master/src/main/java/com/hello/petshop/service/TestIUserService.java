package com.hello.petshop.service;

import com.hello.petshop.entity.TestUser;

public interface TestIUserService {
    public boolean loadUser(TestUser user);
    public boolean loadUser();
}
