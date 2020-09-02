package com.hellojava.service;

import com.hellojava.entity.Users;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class UsersServiceTest {
    private UsersService usersService = new UsersService();

    @Test
   public void testLoadAll(){
        List<Users> usersList = usersService.loadAll();
        usersList.forEach(System.out::println);
    }

}
