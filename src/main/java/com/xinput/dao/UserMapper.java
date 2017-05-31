package com.xinput.dao;

import com.xinput.entity.User;
import org.mybatis.spring.annotation.MapperScan;

/**
 * Created by HP on 2017-05-30.
 */
public interface UserMapper {
    int insertUser(User userEntity);

    User selectByPrimaryKey(Long userId);

    User selectByName(String userName);
}
