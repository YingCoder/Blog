package com.weizujie.dao;

import com.weizujie.pojo.User;
import org.apache.ibatis.annotations.Param;

/**
 * @Author: weizujie
 * @Date: 2020/5/26
 * @Version: 1.0
 * @Github: https://github.com/weizujie
 */
public interface UserMapper {

    User login(@Param("username") String username, @Param("password") String password);

}
