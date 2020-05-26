package com.weizujie.interceptor;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Author: weizujie
 * @Date: 2020/5/26
 * @Version: 1.0
 * @Github: https://github.com/weizujie
 */
public class LoginInterceptor extends HandlerInterceptorAdapter {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        // 判断用户是否登录
        if (request.getSession().getAttribute("loginUser") == null) {
            // 用户未登录，重定向到登录页面
            response.sendRedirect("/admin/login");
            return false;
        }

        // 用户登录，返回 true
        return true;
    }
}
