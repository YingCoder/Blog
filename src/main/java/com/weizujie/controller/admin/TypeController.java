package com.weizujie.controller.admin;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.weizujie.pojo.Type;
import com.weizujie.service.TypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

/**
 * 分类控制器
 *
 * @Author: weizujie
 * @Date: 2020/5/26
 * @Version: 1.0
 * @Github: https://github.com/weizujie
 */


@Configuration
@RequestMapping("/admin")
public class TypeController {

    @Autowired
    private TypeService typeService;

    /**
     * 跳转分类页面并分页查询分类
     *
     * @param model
     * @param pageNum
     * @return
     */
    @GetMapping("/types")
    public String types(Model model, @RequestParam(defaultValue = "1", value = "pageNum") Integer pageNum) {
        PageHelper.startPage(pageNum, 3);
        List<Type> list = typeService.getAllType();
        PageInfo<Type> pageInfo = new PageInfo<>(list);
        model.addAttribute("pageInfo", pageInfo);
        return "admin/types";
    }

    /**
     * 跳转新增页面
     *
     * @return
     */
    @GetMapping("/types/add")
    public String toAddPage() {
        return "admin/types-add";
    }

    /**
     * 新增分类
     *
     * @param type
     * @param attributes
     * @return
     */
    @PostMapping("/types/add")
    public String addType(Type type, RedirectAttributes attributes) {
        Type t = typeService.getTypeByName(type.getName());
        if (t != null) {
            attributes.addFlashAttribute("msg", "不能添加重复的分类");
            return "redirect:/admin/types/add";
        }
        int saveType = typeService.saveType(type);
        if (saveType == 0) {
            attributes.addFlashAttribute("msg", "新增失败");
        } else {
            attributes.addFlashAttribute("msg", "新增成功");
        }
        return "redirect:/admin/types";
    }

    /**
     * 删除分类
     *
     * @param id
     * @param attributes
     * @return
     */
    @GetMapping("/types/delete/{id}")
    public String deleteType(@PathVariable Long id, RedirectAttributes attributes) {
        typeService.deleteType(id);
        attributes.addFlashAttribute("msg", "删除成功");
        return "redirect:/admin/types";
    }

    /**
     * 跳转分类编辑页面并展示当前分类名称
     *
     * @param id
     * @param model
     * @return
     */
    @GetMapping("/types/edit/{id}")
    public String toEditPage(@PathVariable Long id, Model model) {
        Type type = typeService.getType(id);
        model.addAttribute("type", type);
        return "admin/types-edit";
    }

    /**
     * 编辑分类
     *
     * @param type
     * @param attributes
     * @return
     */
    @PostMapping("/types/edit")
    public String editPost(Type type, RedirectAttributes attributes) {
        Type typeByName = typeService.getTypeByName(type.getName());
        if (typeByName != null) {
            attributes.addFlashAttribute("msg", "不能添加重复的分类");
            return "redirect:/admin/types/edit/" + typeByName.getId();
        }
        int updateType = typeService.updateType(type);
        if (updateType == 0) {
            attributes.addFlashAttribute("msg", "编辑失败");
        } else {
            attributes.addFlashAttribute("msg", "编辑成功");
        }
        return "redirect:/admin/types";
    }
}
