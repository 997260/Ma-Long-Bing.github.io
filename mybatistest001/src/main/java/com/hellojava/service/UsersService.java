package com.hellojava.service;

import com.hellojava.config.MybatisManager;
import com.hellojava.dao.UsersMapper;
import com.hellojava.entity.Users;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class UsersService {
    private UsersMapper usersMapper;

    public void init(){
        SqlSession sqlSession = MybatisManager.openSqlSession(true);
        usersMapper = sqlSession.getMapper(UsersMapper.class);
    }

    public List<Users> loadAll(){
        init();
        return usersMapper.loadAll();
    }
}
