package com.xinput.service;

import com.xinput.dao.UserMapper;
import com.xinput.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserMapper userMapper;

    public User getUserById(Long userId) {
        return userMapper.selectByPrimaryKey(userId);
    }
}
