package com.weizujie.service;

import com.weizujie.pojo.Type;

import java.util.List;

/**
 * @Author: weizujie
 * @Date: 2020/5/26
 * @Version: 1.0
 * @Github: https://github.com/weizujie
 */
public interface TypeService {

    int saveType(Type type);

    Type getType(Long id);

    Type getTypeByName(String name);

    Type updateType(Long id, Type type);

    void deleteType(Long id);

    List<Type> getAllType();

}
