package com.jjl.controller;

import com.jjl.pojo.User1;
import com.jjl.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/user")
public class LogControllor {
    @Autowired
    @Qualifier("BookServiceImpl")
    //调取service层
    private BookService booksService;
    @RequestMapping("/login1")
    public  String test(){
        return "login";
    }
    @RequestMapping("/main1")
    public  String test1(){
        return "main";
    }
    @RequestMapping("/gomain")
    public  String test2(HttpSession session,String username,String password){
        System.out.println(username+"-----------"+password);
        String msg=null;
        //将用户名等级到session中
        int i = booksService.queryUser(new User1());
        if(i>0){
            session.setAttribute("user1",username);
            return "/book/allbook";
        }else {
            msg="redirect:/error";
        }
      return  msg;
    }
    //?
    @RequestMapping("/delete")
    public  String test3(HttpServletRequest request){
        HttpSession session = request.getSession();
        session.invalidate();
        System.out.println("---"+session);
        return  "login";
    }
}
