package com.you.iserverservice.service.impl;

import com.you.iserverservice.dao.UserMapper;
import com.you.iserverservice.entity.User;
import com.you.iserverservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: iserver
 * @description: description
 * @author: youyi
 * @create: 2019-12-29 18:16
 **/
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper mapper;
    @Override
    public List<User> getList() {
        return mapper.list();
    }

    @Override
    public Integer addUser(User user) {
        return mapper.insert(user);
    }
}
