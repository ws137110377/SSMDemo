package com.tlstudy.cn.controller;

import com.tlstudy.cn.pojo.User;
import com.tlstudy.cn.service.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class MyController {
    @Autowired
    private MyService ms;
    @RequestMapping("Login")
    public ModelAndView Login(User user){

        ModelAndView mav=new ModelAndView();
        List<User> userList=ms.Login(user);
        System.out.println(userList);
        if (!(userList.isEmpty())){
            mav.setViewName("HomePage");
        }else {
            mav=null;
        }
        return mav;
    }
}
