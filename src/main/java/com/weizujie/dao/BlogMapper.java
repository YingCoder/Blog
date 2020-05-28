package com.weizujie.dao;

import com.weizujie.vo.BlogQuery;

import java.util.List;

/**
 * 博客持久层接口
 *
 * @Author: weizujie
 * @Date: 2020/5/28
 * @Version: 1.0
 * @Github: https://github.com/weizujie
 */
public interface BlogMapper {

    List<BlogQuery> getAllBlogByAdmin();


}
