package com.weizujie.service.impl;

import com.weizujie.dao.TypeMapper;
import com.weizujie.pojo.Type;
import com.weizujie.service.TypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Transactional -> 添加到事务
 * @Author: weizujie
 * @Date: 2020/5/26
 * @Version: 1.0
 * @Github: https://github.com/weizujie
 */


@Service
public class TypeServiceImpl implements TypeService {

    @Autowired
    private TypeMapper typeMapper;

    @Override
    public int saveType(Type type) {
        return typeMapper.saveType(type);
    }

    @Override
    public Type getType(Long id) {
        return null;
    }

    @Override
    public Type getTypeByName(String name) {
        return typeMapper.getTypeByName(name);
    }

    @Override
    public Type updateType(Long id, Type type) {
        return null;
    }

    @Override
    public void deleteType(Long id) {
        typeMapper.deleteType(id);
    }

    @Override
    public List<Type> getAllType() {
        return typeMapper.getAllType();
    }
}
