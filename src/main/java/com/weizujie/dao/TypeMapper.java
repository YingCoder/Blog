package com.weizujie.dao;

import com.weizujie.entity.Type;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 分类持久层接口
 *
 * @Author: weizujie
 * @Date: 2020/5/26
 * @Version: 1.0
 * @Github: https://github.com/weizujie
 */
public interface TypeMapper {

    Type getType(@Param("id") Long id);

    List<Type> getAllType();

    Type getTypeByName(@Param("name") String name);

    int saveType(Type type);

    void deleteType(Long id);

    int updateType(Type type);


}
