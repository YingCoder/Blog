package com.weizujie.controller.admin;

import com.weizujie.entity.User;
import com.weizujie.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpSession;

/**
 * 用户登录控制器
 *
 * @Author: weizujie
 * @Date: 2020/5/26
 * @Version: 1.0
 * @Github: https://github.com/weizujie
 */

@Controller
@RequestMapping("/admin")
public class LoginController {

    @Autowired
    private UserService userService;

    /**
     * 跳转到登录页面
     *
     * @return
     */
    @GetMapping("/login")
    public String toLoginPage() {
        return "admin/login";
    }

    /**
     * 登录校验
     *
     * @param username
     * @param password
     * @param session
     * @param attributes
     * @return
     */
    @PostMapping("/login")
    public String login(@RequestParam String username,
                        @RequestParam String password,
                        HttpSession session,
                        RedirectAttributes attributes) {
        User dbUser = userService.login(username, password);
        if (dbUser != null) {
            // 登录成功
            dbUser.setPassword(null);
            session.setAttribute("loginUser", dbUser);
            return "admin/index";
        } else {
            // 登录失败
            // 登录失败后要重定向到登录页面，如果使用 Model 的话会获取不到 msg，所以使用 RedirectAttributes
            attributes.addFlashAttribute("msg", "用户名或密码错误");
            return "redirect:/admin/login";
        }

    }

    /**
     * 注销
     *
     * @param session
     * @return
     */
    @GetMapping("/logout")
    public String logout(HttpSession session) {
        session.invalidate();
        return "redirect:/admin";
    }

}
