package com.weizujie.service;

import com.weizujie.entity.Type;

import java.util.List;

/**
 * 分类业务层接口
 *
 * @Author: weizujie
 * @Date: 2020/5/26
 * @Version: 1.0
 * @Github: https://github.com/weizujie
 */
public interface TypeService {

    int saveType(Type type);

    Type getType(Long id);

    Type getTypeByName(String name);

    int updateType(Type type);

    void deleteType(Long id);

    List<Type> getAllType();

}
