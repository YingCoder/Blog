package com.weizujie.service;

import com.weizujie.vo.BlogQuery;

import java.util.List;

/**
 * 博客业务层接口
 *
 * @Author: weizujie
 * @Date: 2020/5/27
 * @Version: 1.0
 * @Github: https://github.com/weizujie
 */
public interface BlogService {


    List<BlogQuery> getAllBlogByAdmin();
}
