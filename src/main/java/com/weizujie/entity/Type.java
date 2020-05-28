package com.weizujie.entity;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * 分类实体类
 *
 * @Author: weizujie
 * @Date: 2020/5/26
 * @Version: 1.0
 * @Github: https://github.com/weizujie
 */


@Data
public class Type {
    private Long id;
    private String name;

    private List<Blog> blogs = new ArrayList<>();
}
