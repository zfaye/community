package com.newcode.community.community.service;

import com.newcode.community.community.dao.UserMapper;
import com.newcode.community.community.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;//注入mapper接口（Dao层）

    public User findUserById(int id){
        return userMapper.selectById(id);
    }
}
