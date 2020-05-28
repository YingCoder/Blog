package com.weizujie.entity;

import lombok.Data;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 评论实体类
 *
 * @Author: weizujie
 * @Date: 2020/5/26
 * @Version: 1.0
 * @Github: https://github.com/weizujie
 */


@Data
public class Comment {


    private Long id;
    private String nickname;
    private String email;
    private String content;
    private String avatar;
    private Date createTime;

    private List<Comment> replyComments = new ArrayList<>();

    private Comment parentComment;


    private Blog blog;
}
