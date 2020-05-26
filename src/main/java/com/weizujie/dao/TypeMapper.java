package com.weizujie.dao;

import com.weizujie.pojo.Type;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author: weizujie
 * @Date: 2020/5/26
 * @Version: 1.0
 * @Github: https://github.com/weizujie
 */
public interface TypeMapper {

    List<Type> getAllType();

    Type getTypeByName(@Param("name") String name);

    int saveType(Type type);

    void deleteType(Long id);


}
