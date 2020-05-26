package com.weizujie.pojo;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author: weizujie
 * @Date: 2020/5/26
 * @Version: 1.0
 * @Github: https://github.com/weizujie
 */


@Data
public class Type {
    private Long id;
    @NotBlank(message = "分类名称不能为空")
    private String name;

    private List<Blog> blogs = new ArrayList<>();
}
