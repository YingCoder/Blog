package com.weizujie.dao;

import com.weizujie.entity.User;
import org.apache.ibatis.annotations.Param;

/**
 * 用户持久层接口
 *
 * @Author: weizujie
 * @Date: 2020/5/26
 * @Version: 1.0
 * @Github: https://github.com/weizujie
 */
public interface UserMapper {

    User login(@Param("username") String username, @Param("password") String password);

}
