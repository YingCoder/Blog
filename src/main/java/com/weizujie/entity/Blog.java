package com.weizujie.entity;

import lombok.Data;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 博客实体类
 *
 * @Author: weizujie
 * @Date: 2020/5/26
 * @Version: 1.0
 * @Github: https://github.com/weizujie
 */


@Data
public class Blog {

    private Long id;
    // 标题
    private String title;
    // 正文
    private String content;
    // 首图引用地址
    private String firstPicture;
    // 标记
    private String flag;
    // 浏览次数
    private Integer views;
    // 赞赏开启
    private boolean appreciation;
    // 版权开启
    private boolean shareStatement;
    // 评论开启
    private boolean commentabled;
    // 发布
    private boolean published;
    // 评论
    private boolean recommend;

    private Date createTime;
    private Date updateTime;

    private Type type;

    private User user;

    private List<Comment> comments = new ArrayList<>();

}
