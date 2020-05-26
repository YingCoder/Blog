package com.weizujie.dao;

import com.weizujie.pojo.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Author: weizujie
 * @Date: 2020/5/26
 * @Version: 1.0
 * @Github: https://github.com/weizujie
 */
public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsernameAndPassword(String username, String password);
}
