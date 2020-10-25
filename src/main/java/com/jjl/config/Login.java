package com.jjl.config;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Login implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
       //放行
        HttpSession session = request.getSession();
        //用户登陆过
        if(session.getAttribute("user1")!=null){
            return true;
        }
        //去访问登陆页面不要被拦截
        if(request.getRequestURI().contains("login1")) {
            return  true;
        }
        //登陆请求
        if(request.getRequestURI().contains("gomain")) {
            return true;
        }
        //如果全都不是就直接跳转到登陆界面
        request.getRequestDispatcher("/WEB-INF/jsp/login.jsp").forward(request,response);
        return false;
    }
}
