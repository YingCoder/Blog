package com.weizujie.service;

import com.weizujie.entity.User;

/**
 * 用户业务层接口
 *
 * @Author: weizujie
 * @Date: 2020/5/26
 * @Version: 1.0
 * @Github: https://github.com/weizujie
 */
public interface UserService {

    User login(String username, String password);

}
