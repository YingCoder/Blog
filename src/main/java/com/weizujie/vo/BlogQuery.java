package com.weizujie.vo;

import com.weizujie.entity.Type;
import lombok.Data;

import java.util.Date;

/**
 * 展示数据实体类
 *
 * @Author: weizujie
 * @Date: 2020/5/28
 * @Version: 1.0
 * @Github: https://github.com/weizujie
 */

@Data
public class BlogQuery {


    private Long id;
    private String title;
    private Date updateTime;
    private Boolean recommend;
    private Boolean published;
    private Long typeId;
    private Type type;
}
