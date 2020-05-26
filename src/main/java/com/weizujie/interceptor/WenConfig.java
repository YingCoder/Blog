package com.weizujie.interceptor;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @Author: weizujie
 * @Date: 2020/5/26
 * @Version: 1.0
 * @Github: https://github.com/weizujie
 */

@Configuration
public class WenConfig implements WebMvcConfigurer {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new LoginInterceptor())
                // 拦截 admin 下的所有页面
                .addPathPatterns("/admin/**")
                // 除了登登录页面和 form 表单提交的 admin/login
                .excludePathPatterns("/admin")
                .excludePathPatterns("/admin/login");
    }
}
