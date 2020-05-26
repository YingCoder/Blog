package com.weizujie.controller.admin;

import com.weizujie.pojo.User;
import com.weizujie.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpSession;

/**
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

    @GetMapping
    public String toLoginPage() {
        return "admin/login";
    }


    @PostMapping("/login")
    public String doLogin(@RequestParam String username,
                          @RequestParam String password,
                          HttpSession session,
                          RedirectAttributes attributes) {
        User user = userService.checkUser(username, password);
        if (user != null) {
            // 登录成功
            // 禁止把密码传到 session 里
            user.setPassword(null);
            session.setAttribute("user", user);
            return "admin/index";
        } else {
            // 登录失败
            // 不使用 Model 的原因：因为这里是 redirect 到登录页，使用 Model 的话在前台拿不到 message
            attributes.addFlashAttribute("message", "用户名或密码错误");
            return "redirect:/admin";
        }
    }

    @GetMapping("/logout")
    public String logout(HttpSession session) {
        session.invalidate();
        return "redirect:/admin";
    }

}
