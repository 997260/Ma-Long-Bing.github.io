package com.hellojava.dao;

import com.hellojava.entity.Users;

import javax.jws.soap.SOAPBinding;
import java.util.List;

public interface UsersMapper {
    public List<Users> loadAll();
    public Users loadById();
}
