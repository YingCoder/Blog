package com.weizujie.service.impl;

import com.weizujie.dao.UserMapper;
import com.weizujie.entity.User;
import com.weizujie.service.UserService;
import com.weizujie.util.MD5Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 用户业务层接口实现类
 *
 * @Author: weizujie
 * @Date: 2020/5/26
 * @Version: 1.0
 * @Github: https://github.com/weizujie
 */

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User login(String username, String password) {
        // 使用 MD5 对密码进行加密
        return userMapper.login(username, MD5Utils.code(password));
    }
}
