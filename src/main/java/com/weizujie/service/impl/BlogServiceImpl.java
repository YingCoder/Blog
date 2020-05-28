package com.weizujie.service.impl;

import com.weizujie.dao.BlogMapper;
import com.weizujie.service.BlogService;
import com.weizujie.vo.BlogQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 博客业务层接口实现类
 *
 * @Author: weizujie
 * @Date: 2020/5/28
 * @Version: 1.0
 * @Github: https://github.com/weizujie
 */

@Service
public class BlogServiceImpl implements BlogService {

    @Autowired
    private BlogMapper blogMapper;

    @Override
    public List<BlogQuery> getAllBlogByAdmin() {
        return blogMapper.getAllBlogByAdmin();
    }
}
