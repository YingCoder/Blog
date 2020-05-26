package com.weizujie.service;

import com.weizujie.pojo.User;

/**
 * @Author: weizujie
 * @Date: 2020/5/26
 * @Version: 1.0
 * @Github: https://github.com/weizujie
 */
public interface UserService {

    User checkUser(String username, String password);

}
